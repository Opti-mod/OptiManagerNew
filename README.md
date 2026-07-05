<div align="center">

  # Opti Manager

  Easily install Opti on Android

  [![Latest release](https://img.shields.io/github/v/release/Opti-mod/OptiUpdated?color=3AB8BA&display_name=release&label=Latest&style=for-the-badge)](https://github.com/Opti-mod/OptiUpdated/releases/latest)
  
  ---

  <br>

  ![Debug build status](https://img.shields.io/github/actions/workflow/status/Opti-mod/OptiUpdated/build-debug.yml?label=Debug%20Build&logo=github&style=for-the-badge&branch=main)
  [![Stars](https://img.shields.io/github/stars/Opti-mod/OptiUpdated?logo=github&style=for-the-badge)](https://github.com/Opti-mod/OptiUpdated/stargazers)
  [![Discord](https://img.shields.io/discord/1196075698301968455?logo=discord&logoColor=white&style=for-the-badge)](https://discord.gg/XjYgWXHb9Q)
  
  <br>
  
  ![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/Opti-mod/OptiUpdated?logo=github&logoColor=%23fff&style=for-the-badge)
  ![Downloads (latest)](https://img.shields.io/github/downloads/Opti-mod/OptiUpdated/latest/total?style=for-the-badge&logo=github&label=Downloads%20(Latest)&color=blue)
  ![Total downloads](https://img.shields.io/github/downloads/Opti-mod/OptiUpdated/total?style=for-the-badge&logo=github&label=Downloads%20(Total)&color=blue)
  ![GitHub top language](https://img.shields.io/github/languages/top/Opti-mod/OptiUpdated?style=for-the-badge)

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
    - `git clone https://github.com/Opti-mod/OptiUpdated.git && cd OptiUpdated`
2. Build the project
    - Linux: `chmod +x ./gradlew && gradlew assembleDebug`
    - Windows: `./gradlew assembleDebug`
3. Install on device
    - [Enable USB debugging](https://developer.android.com/studio/debug/dev-options) and plug in your phone
    - Run `adb install app/build/outputs/apk/debug/app-debug.apk`

## Contributing

This is an open-source project, you can do so without any programming.

Here are a few things you can do:

- [Test and report issues](https://github.com/Opti-mod/OptiUpdated/issues/new/choose)
<!-- - [Translate the app into your language](https://crowdin.com/project/vendetta-manager) -->
    
License
---
Bunny Manager is licensed under the Open Software License version 3.0

[![License: OSL v3](https://img.shields.io/badge/License-OSL%20v3-blue.svg?style=for-the-badge)](https://github.com/Opti-mod/OptiUpdated/blob/main/LICENSE)
