package com.remziakgoz.currencyapp
class IOSPlatform: Platform {
    override val name: String = "iOS"
}

actual fun getPlatform(): Platform = IOSPlatform()