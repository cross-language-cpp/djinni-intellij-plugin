# Developer Guide

This document is supposed to help developers that want to make changes to the plugin.

## Development Basics

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

### Adjusting grammar

The grammar for `.djinni` files is defined in Backus–Naur form in `Djinni.bnf`

If you decide to make changes to this file, the following manual steps are required to apply them:
- `Djinni.bnf`: 
    - <kbd>Right-Click</kbd> > <kbd>Generate Parser Code</kbd>
    - <kbd>Right-Click</kbd> > <kbd>Generate JFlex Lexer</kbd>, in the file dialog click <kbd>Save</kbd> and <kbd>Replace</kbd>
- `_DjinniLexer.flex`:
    - <kbd>Right-Click</kbd> > <kbd>Run JFlex Generator</kbd>