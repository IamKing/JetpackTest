# JetpackTest Study Log
Android Jetpack Study and Test<br/>

**IDE: Android Studio 3.3 Canary 3**

## 注意事项1

加载Jetpack的库时需要注意 `app/build.gradle`里面需要加载的Android库要么是传统的api package,
要么全是**androidx**库,否则会出现一些莫名的错误。具体的新旧框架对应的库请参考.<br/>
https://developer.android.com/topic/libraries/support-library/refactor

## Data Binding
一个简单的实例在下面的包下面，更多特性会在整个Jetpack框架学习完以后再追加
[mainpackage]/databindings/*
