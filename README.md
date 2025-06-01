# CurrencyApp 💱

A modern, cross-platform currency exchange application built with Kotlin Multiplatform and Compose Multiplatform. CurrencyApp provides users with up-to-date currency exchange rates and seamless currency conversion capabilities across Android and iOS platforms.

## ✨ Features

- **Real-time Exchange Rates**: Get the latest currency exchange rates
- **Multi-Currency Support**: Convert between multiple international currencies
- **Cross-Platform**: Single codebase for both Android and iOS
- **Modern UI**: Beautiful, intuitive interface built with Compose Multiplatform
- **Offline Capability**: Access previously loaded rates when offline
- **Fast Performance**: Optimized for quick conversions and smooth user experience

## 🎯 Target Audience

- **Travelers**: Quickly convert currencies while traveling internationally
- **Traders**: Stay updated with current exchange rates for trading decisions
- **General Users**: Anyone needing accurate, real-time currency conversion

## 🏗️ Architecture

This project follows Kotlin Multiplatform architecture with shared business logic:

```
CurrencyApp/
├── composeApp/           # Shared Compose Multiplatform code
│   ├── commonMain/       # Common code for all platforms
│   ├── androidMain/      # Android-specific implementations
│   └── iosMain/          # iOS-specific implementations
├── iosApp/               # iOS application entry point
└── androidApp/           # Android application module
```

### Technology Stack

- **Kotlin Multiplatform**: Share business logic across platforms
- **Compose Multiplatform**: Unified UI framework for Android and iOS
- **Ktor Client**: HTTP networking for API calls
- **Kotlinx Serialization**: JSON parsing and serialization
- **Coroutines**: Asynchronous programming
- **SQLDelight**: Cross-platform database (if applicable)

## 🚀 Getting Started

### Prerequisites

- **Android Studio** (Arctic Fox or newer) with Kotlin Multiplatform Mobile plugin
- **Xcode** (for iOS development)
- **JDK 11** or higher
- **iOS Simulator** or physical iOS device
- **Android device/emulator** (API level 21+)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/remziakgoz/CurrencyApp.git
   cd CurrencyApp
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open an existing project"
   - Navigate to the cloned repository folder

3. **Build the project**
   ```bash
   ./gradlew build
   ```

### Running the Application

#### Android
```bash
./gradlew :composeApp:installDebug
```
Or run directly from Android Studio using the Android run configuration.

#### iOS
1. Open the `iosApp/iosApp.xcodeproj` in Xcode
2. Select your target device/simulator
3. Click Run button or press `Cmd + R`

Alternatively, you can run from Android Studio using the iOS run configuration.

## 📱 Usage

1. **Launch the app** on your device
2. **Select source currency** from the dropdown menu
3. **Enter the amount** you want to convert
4. **Choose target currency** for conversion
5. **View real-time conversion** results instantly
6. **Swap currencies** with a single tap for reverse conversion

## 🛠️ Development

### Project Structure

- **`/composeApp/commonMain`**: Contains shared business logic, data models, repositories, and common UI components
- **`/composeApp/androidMain`**: Android-specific implementations and platform code
- **`/composeApp/iosMain`**: iOS-specific implementations and platform code
- **`/iosApp`**: iOS app entry point and platform-specific configurations

### Key Components

- **Currency Models**: Data classes representing currency information
- **Exchange Rate API**: Service layer for fetching real-time rates
- **Repository Pattern**: Data management and caching
- **Compose UI**: Shared UI components across platforms
- **Platform-Specific Code**: Device-specific functionalities

### Building for Production

#### Android
```bash
./gradlew :composeApp:assembleRelease
```

#### iOS
1. Open `iosApp.xcodeproj` in Xcode
2. Select "Any iOS Device" as target
3. Product → Archive
4. Follow App Store distribution workflow

## 🤝 Contributing

We welcome contributions! Please follow these steps:

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/amazing-feature
   ```
3. **Commit your changes**
   ```bash
   git commit -m 'Add some amazing feature'
   ```
4. **Push to the branch**
   ```bash
   git push origin feature/amazing-feature
   ```
5. **Open a Pull Request**

### Development Guidelines

- Follow Kotlin coding conventions
- Add unit tests for new features
- Update documentation as needed
- Ensure cross-platform compatibility
- Test on both Android and iOS before submitting

## 📋 Requirements

### Minimum System Requirements

**Android:**
- Android 5.0 (API level 21) or higher
- 50 MB free storage space

**iOS:**
- iOS 14.0 or higher
- 50 MB free storage space

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Remzi Akgoz**
- GitHub: [@remziakgoz](https://github.com/remziakgoz)

## 🙏 Acknowledgments

- [Kotlin Multiplatform](https://kotlinlang.org/multiplatform/) team for the amazing cross-platform technology
- [Compose Multiplatform](https://www.jetbrains.com/compose-multiplatform/) for unified UI development
- [JetBrains](https://www.jetbrains.com/) for developing excellent development tools
- Currency exchange rate API providers
- Open source community for various libraries and tools

## 📞 Support

If you encounter any issues or have questions:

1. Check existing [Issues](https://github.com/remziakgoz/CurrencyApp/issues)
2. Create a new issue with detailed description
3. Reach out to the maintainer

---

**Happy Converting! 🚀💱**
