# Project Structure

```
cheatmod/
├── .github/
│   └── workflows/
│       ├── build.yml                    # Automatic build workflow
│       └── release.yml                  # Release creation workflow
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── cheatmod/
│       │               ├── CheatMod.java              # Main mod class
│       │               ├── CheatModClient.java        # Client-side initialization
│       │               ├── config/
│       │               │   └── ModConfig.java         # Configuration manager
│       │               ├── gui/
│       │               │   └── CheatModScreen.java    # In-game settings menu
│       │               └── mixin/
│       │                   ├── PlayerEntityMixin.java      # No damage, unlimited breath, max XP
│       │                   ├── LivingEntityMixin.java      # One hit kill
│       │                   ├── ItemStackMixin.java         # Indestructible tools
│       │                   └── ScreenHandlerMixin.java     # Max inventory size
│       └── resources/
│           ├── fabric.mod.json          # Mod metadata
│           ├── cheatmod.mixins.json     # Mixin configuration
│           └── assets/
│               └── cheatmod/
│                   ├── icon.png.txt     # Icon placeholder
│                   └── lang/
│                       ├── en_us.json   # English translations
│                       └── ru_ru.json   # Russian translations
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar           # Gradle wrapper binary
│       └── gradle-wrapper.properties    # Gradle version config
├── build.gradle                         # Build configuration
├── gradle.properties                    # Project properties
├── settings.gradle                      # Gradle settings
├── gradlew                              # Unix build script
├── gradlew.bat                          # Windows build script
├── LICENSE                              # MIT License
├── README.md                            # Main documentation
├── SETUP.md                             # Setup instructions
├── GITHUB_ACTIONS.md                    # GitHub Actions documentation
└── .gitignore                           # Git ignore rules
```

## Features Implementation

### 1. No Damage (PlayerEntityMixin.java)
- Intercepts damage events
- Cancels all damage to the player
- Configurable via in-game menu

### 2. Unlimited Breath (PlayerEntityMixin.java)
- Constantly sets air value to maximum
- Prevents drowning
- Configurable via in-game menu

### 3. Max Score/XP (PlayerEntityMixin.java)
- Automatically sets experience level to 10000
- Updates every tick
- Configurable via in-game menu

### 4. One Hit Kill (LivingEntityMixin.java)
- Modifies damage dealt by player
- Sets damage to target's max health + 1000
- Only affects non-player entities
- Configurable via in-game menu

### 5. Indestructible Tools (ItemStackMixin.java)
- Cancels durability damage
- Applies to all items with durability
- Configurable via in-game menu

### 6. Max Inventory Size (ScreenHandlerMixin.java)
- Automatically fills item stacks to maximum
- Triggers on slot interactions
- Configurable via in-game menu

## Configuration System

### ModConfig.java
- Manages mod settings
- Saves/loads configuration from `config/cheatmod.json`
- Automatically created on first run

### CheatModScreen.java
- In-game GUI for toggling features
- Opened with U key (configurable in Controls menu)
- Real-time toggle without game restart
- Shows feature status (ON/OFF)

### Keybinding
- Default key: U
- Can be changed in Minecraft Controls settings
- Category: "Cheat Mod"

## Building

Requirements:
- Java 21 or higher
- Internet connection (first build only)

Commands:
```bash
./gradlew build        # Build the mod
./gradlew runClient    # Run Minecraft with the mod
./gradlew clean        # Clean build files
```

## Output

The compiled mod will be located at:
```
build/libs/cheatmod-1.0.0.jar
```

Copy this JAR file to your Minecraft mods folder.
