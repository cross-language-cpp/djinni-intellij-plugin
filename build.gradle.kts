import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
// make git-version work with kotlin-dsl - read more: https://github.com/palantir/gradle-git-version/issues/188
val gitVersion: groovy.lang.Closure<String> by extra

plugins {
    // Java support
    id("java")
    // Kotlin support
    id("org.jetbrains.kotlin.jvm") version "1.4.21"
    // gradle-intellij-plugin - read more: https://github.com/JetBrains/gradle-intellij-plugin
    id("org.jetbrains.intellij") version "0.6.4"
    // get version from git tag
    id("com.palantir.git-version") version "0.12.3"
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src/main/java", "src/main/gen/java"))
        }
    }
}

group = "com.github.cross_language_cpp.djinni_intellij_plugin"

version = gitVersion()

// Configure project's dependencies
repositories {
    mavenCentral()
    jcenter()
}

// Configure gradle-intellij-plugin plugin.
// Read more: https://github.com/JetBrains/gradle-intellij-plugin
intellij {
    pluginName = "djinni-intellij-plugin"
    version = "2019.3"
    type = "IC"
    downloadSources = false
    updateSinceUntilBuild = true
    setPlugins("java")
}

tasks {
    // Set the compatibility versions to 1.8
    withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }
    listOf("compileKotlin", "compileTestKotlin").forEach {
        getByName<KotlinCompile>(it) {
            kotlinOptions.jvmTarget = "1.8"
        }
    }
    patchPluginXml {
        version(version)
        sinceBuild("193")
        untilBuild("203.*")
    }

    publishPlugin {
        token(System.getenv("PUBLISH_TOKEN"))
    }
}
