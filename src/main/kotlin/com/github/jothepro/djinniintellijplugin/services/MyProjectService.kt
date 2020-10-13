package com.github.jothepro.djinniintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.jothepro.djinniintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
