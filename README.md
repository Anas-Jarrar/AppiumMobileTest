# Android Calculator App Test using Appium

This project is a basic example of using **Appium**, **TestNG**, and **Selenium** to automate testing of an Android Calculator application using Java.

---

## 📱 Tools & Technologies

- Java 21
- Appium
- TestNG
- Selenium
- Apache Commons IO
- Maven

---

## 📁 Project Structure

```
src/
├── MyApplication/
│   └── calculator.apk          # Your test APK
├── ScreenShoots/
│   └── *.jpg                   # Screenshots saved by tests
└── MyTest.java                 # Main test class
```

---

## 🚀 How to Run the Tests

1. **Start the Appium Server**
   ```bash
   appium
   ```

2. **Start Android Emulator or connect a physical device**
   ```bash
   adb devices
   ```

3. **Run Tests**
   - Use your IDE (e.g., IntelliJ or Eclipse) to run the `MyTest.java` class with TestNG.
   - Or run via Maven (if configured):  
     ```bash
     mvn test
     ```

---

## ✅ Tests Description

### `MyTest.java`

- `MyTest()` *(disabled)*  
  ➤ Tests 5 × 9 = 45 on the calculator app.

- `ClickOnlyOnTheNumbers()`  
  ➤ Clicks all digit buttons dynamically  
  ➤ Takes a screenshot with a timestamped filename

---

## 📸 Screenshots

Screenshots are saved in the `src/ScreenShoots/` folder, named using the current date and time.

---

## 📝 Requirements

- Appium Server installed and running
- Android SDK configured
- Maven installed
- APK file at: `src/MyApplication/calculator.apk`

---

## 📦 Maven Dependencies

These are included in your `pom.xml` file:

```xml
<dependencies>
  <!-- Apache Commons IO -->
  <dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.19.0</version>
  </dependency>

  <!-- Selenium Java -->
  <dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.8.3</version>
  </dependency>

  <!-- TestNG -->
  <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.7.1</version>
    <scope>test</scope>
  </dependency>

  <!-- Appium Java Client -->
  <dependency>
    <groupId>io.appium</groupId>
    <artifactId>java-client</artifactId>
    <version>8.3.0</version>
  </dependency>
</dependencies>
```

---

## ⚙️ Java Version

Java 21 is used in this project. Set via Maven compiler plugin:

```xml
<plugin>
  <artifactId>maven-compiler-plugin</artifactId>
  <version>3.13.0</version>
  <configuration>
    <release>21</release>
  </configuration>
</plugin>
```

---

## 📧 Author

- 👨‍💻 Anas Jarrar 
- 📍 Jordan  
- 📅 Last updated: May 2025

---