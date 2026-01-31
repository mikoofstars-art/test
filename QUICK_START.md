# Quick Start Guide / Быстрый старт

## For Users / Для пользователей

### Installation / Установка

1. Install Minecraft 1.21.1 and Fabric Loader / Установите Minecraft 1.21.1 и Fabric Loader
2. Download Fabric API / Скачайте Fabric API
3. Download the latest release JAR from GitHub Releases / Скачайте последний JAR из GitHub Releases
4. Place JAR file in `.minecraft/mods/` folder / Поместите JAR в папку `.minecraft/mods/`
5. Launch game / Запустите игру

### Usage / Использование

**Press U key** in-game to open the cheat menu / **Нажмите клавишу U** в игре для открытия меню

## For Developers / Для разработчиков

### Setup Repository / Настройка репозитория

```bash
git clone <your-repo-url>
cd cheatmod
chmod +x ./gradlew
```

### Local Build / Локальная сборка

```bash
./gradlew build
```

Output: `build/libs/cheatmod-1.0.0.jar`

### Publish to GitHub / Публикация на GitHub

#### Option 1: Create Release via Tag / Вариант 1: Релиз через тег

```bash
git add .
git commit -m "Add menu and GitHub Actions"
git push

git tag v1.0.0
git push origin v1.0.0
```

GitHub Actions will automatically:
- Build the mod
- Create a release
- Attach the JAR file

GitHub Actions автоматически:
- Соберет мод
- Создаст релиз
- Прикрепит JAR файл

#### Option 2: Manual Release / Вариант 2: Ручной релиз

1. Go to your repository on GitHub / Откройте репозиторий на GitHub
2. Click "Actions" / Нажмите "Actions"
3. Select "Create Release" workflow
4. Click "Run workflow" / Нажмите "Run workflow"
5. Wait for completion / Дождитесь завершения
6. Check "Releases" section / Проверьте раздел "Releases"

### Test in Minecraft / Тест в Minecraft

```bash
./gradlew runClient
```

This will launch Minecraft with the mod installed.
Это запустит Minecraft с установленным модом.

## Key Features / Основные возможности

| Feature | Key | Description |
|---------|-----|-------------|
| Open Menu | U | Opens configuration menu / Открывает меню настроек |
| No Damage | Toggle | Player takes no damage / Игрок не получает урона |
| Unlimited Breath | Toggle | Infinite underwater breathing / Бесконечное дыхание под водой |
| One Hit Kill | Toggle | Kill mobs instantly / Мгновенное убийство мобов |
| Max Score | Toggle | XP Level 10000 / Уровень опыта 10000 |
| Indestructible Tools | Toggle | Tools never break / Инструменты не ломаются |
| Max Inventory | Toggle | Auto-fill stacks / Авто-заполнение стаков |

## Configuration File / Файл конфигурации

Location / Расположение: `.minecraft/config/cheatmod.json`

Example / Пример:
```json
{
  "noDamage": true,
  "unlimitedBreath": true,
  "oneHitKill": true,
  "indestructibleTools": true,
  "maxScore": true,
  "maxInventorySize": true
}
```

All settings are adjustable in-game via the menu (U key).
Все настройки можно изменить в игре через меню (клавиша U).
