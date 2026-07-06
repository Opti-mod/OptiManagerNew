<div align="center">

  # OptiManagerNew

  Easily install Opti on Android

  [![Latest release](https://img.shields.io/github/v/release/Opti-mod/OptiManagerNew?color=3AB8BA&display_name=release&label=Latest&style=for-the-badge)](https://github.com/Opti-mod/OptiManagerNew/releases/latest)
  
  ---

  <br>

  ![Debug build status](https://img.shields.io/github/actions/workflow/status/Opti-mod/OptiManagerNew/build-debug.yml?label=Debug%20Build&logo=github&style=for-the-badge&branch=main)
  <br>
  ![Downloads (latest)](https://img.shields.io/github/downloads/Opti-mod/OptiManagerNew/latest/total?style=for-the-badge&logo=github&label=Downloads%20(Latest)&color=blue)
  ![Total downloads](https://img.shields.io/github/downloads/Opti-mod/OptiManagerNew/total?style=for-the-badge&logo=github&label=Downloads%20(Total)&color=blue)

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
    - `git clone https://github.com/Opti-mod/OptiManagerNew.git && cd OptiManagerNew`
2. Build the project
    - Linux: `chmod +x ./gradlew && gradlew assembleDebug`
    - Windows: `./gradlew assembleDebug`
3. Install on device
    - [Enable USB debugging](https://developer.android.com/studio/debug/dev-options) and plug in your phone
    - Run `adb install app/build/outputs/apk/debug/app-debug.apk`
    
License
---
Bunny Manager is licensed under the Open Software License version 3.0

[![License: OSL v3](https://img.shields.io/badge/License-OSL%20v3-blue.svg?style=for-the-badge)](https://github.com/Opti-mod/OptiManagerNew/blob/main/LICENSE)
