package com.lucas.vortex

import androidx.compose.ui.window.ComposeUIViewController

// Name must stay PascalCase: iosApp.swift calls this as `ViewControllerKt.ViewController()`.
@Suppress("ktlint:standard:function-naming")
fun ViewController() = ComposeUIViewController { App() }
