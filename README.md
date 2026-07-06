<div align="center">

  # OptiManager

  Easily install Opti on Android!

  [![Latest release](https://img.shields.io/github/v/release/Opti-mod/OptiManager?color=3AB8BA&display_name=release&label=Latest&style=for-the-badge)](https://github.com/Opti-mod/OptiManager/releases/latest)
  
  ---

  <br>

  ![Debug build status](https://img.shields.io/github/actions/workflow/status/Opti-mod/OptiManager/build-debug.yml?label=Debug%20Build&logo=github&style=for-the-badge&branch=main)
  <br>
  ![Downloads (latest)](https://img.shields.io/github/downloads/Opti-mod/OptiManager/latest/total?style=for-the-badge&logo=github&label=Downloads%20(Latest)&color=blue)
  ![Total downloads](https://img.shields.io/github/downloads/Opti-mod/OptiManager/total?style=for-the-badge&logo=github&label=Downloads%20(Total)&color=blue)

  <br>

  <img src="images/screenshot_home.jpg" width="200px">
  
</div>

Build
---

#### Prerequisites
  - [Git](https://git-scm.com/downloads)
  - [JDK 17](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
  - [Android SDK](https://developer.android.com/studio)

#### Instructions

1. Clone the repo
    - `git clone https://github.com/Opti-mod/OptiManager.git && cd OptiManager`
2. Build the project
    - Linux: `chmod +x ./gradlew && gradlew assembleDebug`
    - Windows: `./gradlew assembleDebug`
3. Install on device
    - [Enable USB debugging](https://developer.android.com/studio/debug/dev-options) and plug in your phone
    - Run `adb install app/build/outputs/apk/debug/app-debug.apk`
    
License
---
Opti Manager is licensed under the Open Software License version 3.0

[![License: OSL v3](https://img.shields.io/badge/License-OSL%20v3-blue.svg?style=for-the-badge)](https://github.com/Opti-mod/OptiManager/blob/main/LICENSE)
