
  

# ZukuLock

  

## Introduction

  

**ZukuLock** is a lightweight Android application that allows you to quickly toggle the screen on or off with a single tap. The app utilizes **Shizuku** to execute the `input keyevent 26` command, mimicking the physical power button. This is particularly useful for reducing wear and tear on your power button or adding convenience to screen control.

  

This app was initially designed for **Google Pixel devices**, which lack the **double-tap-to-lock** feature. Most screen lock apps require **Accessibility permissions**, but enabling Accessibility can lead to certain banking apps in Vietnam (and possibly others globally) blocking access for security reasons. **ZukuLock** offers a workaround by avoiding Accessibility permissions, allowing you to use banking apps seamlessly.

  

----------

  

## Key Features

  

-  **Quick Screen Toggle**: Acts as a virtual power button.

-  **Shizuku Integration**: Leverages system-level permissions without requiring root access.

-  **No UI Interruption**: Simply tap the app icon to execute the action without launching any additional windows.

-  **Customizable Gestures**: Works with launchers like **Lawnchair** or **Nova Launcher** to enable double-tap gestures for locking the screen.

  

----------

  

## Requirements

  

-  **Android 7.0 or higher**.

-  **Shizuku** must be installed and properly configured before use.

  

----------

  

## How to Use

  

1. Install the ZukuLock application.

2. Ensure **Shizuku** is running and the app has been granted permissions.

3. Tap the app icon to toggle the screen on or off.

4. For double-tap-to-lock gestures, use launchers like **Lawnchair** or **Nova Launcher** to map the gesture to open ZukuLock.

  

----------

  

## Notes

  

- This app does not require root access but relies on **Shizuku** for executing system commands.

- The screen toggle functionality is implemented using the `adb shell input keyevent 26` command.

- Avoids the need for Accessibility permissions, enabling smooth use of banking apps that restrict access when Accessibility is enabled.

  

----------

  

## Contribution

  

If you have ideas or want to contribute to improving the app, feel free to provide feedback or open a pull request on this repository.

  

----------

  

## Contact

  

For any questions or support, please reach out via email: [tien.dnm@outlook.com].


----------

## License

This project is licensed under the [MIT License](LICENSE).
