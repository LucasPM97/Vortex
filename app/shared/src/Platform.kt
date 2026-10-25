package com.lucas.vortex

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
