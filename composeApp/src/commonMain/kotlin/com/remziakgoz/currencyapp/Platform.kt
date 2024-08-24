package com.remziakgoz.currencyapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform