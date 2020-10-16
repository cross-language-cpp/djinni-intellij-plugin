# djinni-intellij-plugin

![Build](https://github.com/cross-language-cpp/djinni-intellij-plugin/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

<!-- Plugin description -->
Add some basic navigation, code-completion and error highlighting support to .djinni files.
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
To install the local plugin build go to

<kbd>Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>⚙</kbd> > <kbd>Install plugin from disk...</kbd>

You can find the built plugin package under `build/distributions/djinni-intellij-plugin-<version>.zip`

---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
