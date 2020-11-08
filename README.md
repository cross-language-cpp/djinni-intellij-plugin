# djinni-intellij-plugin

![Build](https://github.com/cross-language-cpp/djinni-intellij-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

<!-- Plugin description -->
Adds basic navigation, code-completion and error highlighting support for `.djinni` IDL files.

Djinni is a tool for generating cross-language type declarations and interface bindings. It's designed to connect C++ with either Java or Objective-C.
<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "djinni-intellij-plugin"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/cross-language-cpp/djinni-intellij-plugin/releases/latest) and install it manually using
  <kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

## Plugin development
### Build
To build on your local machine, run the `buildPlugin` task

```bash
./gradlew buildPlugin
```

### Debug
With the `runIde` task you can run the plugin in an isolated IDE and get logs about whats going on.

### Install
To install the plugin you just built locally, go to

<kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>⚙</kbd> > <kbd>Install plugin from disk...</kbd>

You can find the built plugin package under `build/distributions/djinni-intellij-plugin-<version>.zip`

---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
