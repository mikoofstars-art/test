# Changelog

All notable changes to this project will be documented in this file.

## [1.0.0] - 2026-01-31

### Added
- In-game configuration menu accessible via U key
- Configuration system that saves settings to `config/cheatmod.json`
- Real-time toggle for all cheat features without game restart
- GitHub Actions workflows for automated building and releases
- Keybinding system with customizable keys
- Language support (English and Russian)
- Visual feedback for feature status (ON/OFF) in menu

### Changed
- Configuration moved from static variables to ModConfig class
- All mixins now check config before applying effects
- Updated README with menu usage instructions
- Updated project structure documentation

### Technical Changes
- Added `ModConfig.java` for configuration management
- Added `CheatModScreen.java` for GUI menu
- Updated `CheatMod.java` to load and save configuration
- Updated `CheatModClient.java` to register keybinding
- All mixins now use `CheatMod.config` instead of static booleans
- Added language files for keybinding localization

### CI/CD
- Added `.github/workflows/build.yml` for automatic building
- Added `.github/workflows/release.yml` for release automation
- Build artifacts are uploaded on every push to main/master
- Releases are created automatically when tags are pushed

### Documentation
- Added `GITHUB_ACTIONS.md` with CI/CD instructions
- Added `README_RU.md` with Russian documentation
- Added `CHANGELOG.md` to track changes
- Updated `PROJECT_STRUCTURE.md` with new components

## Features

All features are now configurable via in-game menu:
- No Damage
- Unlimited Breath
- Max Inventory Size
- One Hit Kill
- Max Score (Level 10000)
- Indestructible Tools
