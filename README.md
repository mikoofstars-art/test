# Minecraft Cheat Mod

Fabric mod for Minecraft 1.21.1 with various cheat features.


## Features

1. **No Damage** - Player takes no damage from any source
2. **Unlimited Breath** - Infinite underwater breathing
3. **Max Inventory Size** - Automatically fills item stacks to maximum count
4. **One Hit Kill** - Kill any mob with a single hit
5. **Max Score** - Automatically sets experience level to 10000
6. **Indestructible Tools** - Tools and items never lose durability

## Installation

1. Install Minecraft 1.21.1
2. Install Fabric Loader 0.16.5 or higher
3. Download Fabric API from [CurseForge](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
4. Place the mod JAR file in your `.minecraft/mods` folder
5. Launch Minecraft with the Fabric profile

## Building from Source

### Prerequisites
- Java 21 or higher
- Gradle (included via wrapper)

### Build Steps

```bash
./gradlew build
```

The compiled mod JAR will be in `build/libs/` directory.

## Configuration

All features are enabled by default. To disable specific features, modify the boolean values in `CheatMod.java`:

```java
public static boolean noDamage = true;
public static boolean unlimitedBreath = true;
public static boolean oneHitKill = true;
public static boolean indestructibleTools = true;
public static boolean maxScore = true;
public static boolean maxInventorySize = true;
```

## Technical Details

- **Minecraft Version**: 1.21.1
- **Fabric Loader**: 0.16.5+
- **Fabric API**: 0.104.0+1.21.1
- **Java Version**: 21

## License

MIT License - see LICENSE file for details.
