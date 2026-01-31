# Setup Instructions

## Important: Gradle Wrapper JAR

Before building this mod, you need to download the Gradle Wrapper JAR file:

1. Download gradle-wrapper.jar from:
   https://raw.githubusercontent.com/gradle/gradle/v8.5.0/gradle/wrapper/gradle-wrapper.jar

2. Place it in the `gradle/wrapper/` directory

Alternatively, if you have Gradle installed globally, you can generate the wrapper:

```bash
gradle wrapper --gradle-version 8.5
```

## Building the Mod

Once the Gradle wrapper is set up:

```bash
./gradlew build
```

The compiled mod will be in `build/libs/cheatmod-1.0.0.jar`

## Development Setup

### IntelliJ IDEA
1. Open the project folder
2. IDEA will automatically detect the Gradle project
3. Wait for dependencies to download

### Eclipse
1. Import as existing Gradle project
2. Wait for dependencies to download

### VS Code
1. Install "Extension Pack for Java"
2. Install "Gradle for Java"
3. Open the project folder

## Testing the Mod

1. Run the client:
   ```bash
   ./gradlew runClient
   ```

2. The game will launch with the mod loaded

## Mod Features Configuration

Edit `src/main/java/com/example/cheatmod/CheatMod.java` to enable/disable features:

```java
public static boolean noDamage = true;           // No damage
public static boolean unlimitedBreath = true;     // Unlimited breath underwater
public static boolean oneHitKill = true;          // One hit kill
public static boolean indestructibleTools = true; // Tools never break
public static boolean maxScore = true;            // Max XP level
public static boolean maxInventorySize = true;    // Auto-fill item stacks
```

Set any value to `false` to disable that feature.
