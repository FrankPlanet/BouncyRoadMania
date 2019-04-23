package io.github.chrislo27.bouncyroadmania

import io.github.chrislo27.toolboks.version.Version


object BRMania {

    const val TITLE = "Crossing"
    val VERSION: Version = Version(0, 1, 0, "DEVELOPMENT")
    const val WIDTH = 1280
    const val HEIGHT = 720

    lateinit var launchArguments: List<String>

}