package com.example.myapplication

import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class PaparazziSnapshotTest {

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5,
    )

    @Test
    fun launchComposable() {
        paparazzi.snapshot {
            GreetingPreview()
        }
    }
}