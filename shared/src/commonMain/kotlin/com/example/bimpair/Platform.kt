package com.example.bimpair

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform