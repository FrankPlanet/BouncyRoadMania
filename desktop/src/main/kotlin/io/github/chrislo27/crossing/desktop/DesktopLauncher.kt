package io.github.chrislo27.crossing.desktop

object DesktopLauncher {

    @JvmStatic
    fun main(args: Array<String>) {
        // https://github.com/chrislo27/RhythmHeavenRemixEditor/issues/273
        System.setProperty("jna.nosys", "true")

//        RHRE3.launchArguments = args.toList()
//
//        val logger = Logger()
//        val portable = "--portable-mode" in args
//        val app = RHRE3Application(logger, File(if (portable) ".rhre3/logs/" else System.getProperty("user.home") + "/.rhre3/logs/"))
//        ToolboksDesktopLauncher(app)
//                .editConfig {
//                    this.width = app.emulatedSize.first
//                    this.height = app.emulatedSize.second
//                    this.title = app.getTitle()
//                    this.fullscreen = false
//                    val fpsArg = args.find { it.startsWith("--fps=") }
//                    this.foregroundFPS = (if (fpsArg != null) {
//                        val num = fpsArg.substringAfter('=')
//                        val parsed = num.toIntOrNull()
//                        val adjusted = parsed?.coerceAtLeast(30) ?: 60
//                        if (parsed == null) {
//                            logger.info("Failed to parse manual FPS: $num")
//                        } else {
//                            logger.info("Manually setting FPS to $adjusted (requested: $num)")
//                        }
//                        adjusted
//                    } else 60).coerceAtLeast(30)
//                    this.backgroundFPS = this.foregroundFPS.coerceIn(30, 60)
//                    this.resizable = true
//                    this.vSyncEnabled = this.foregroundFPS <= 60
//                    this.initialBackgroundColor = Color(0f, 0f, 0f, 1f)
//                    this.allowSoftwareMode = true
//                    this.audioDeviceSimultaneousSources = 250
//                    this.useHDPI = true
//                    if (portable) {
//                        this.preferencesFileType = Files.FileType.Local
//                        this.preferencesDirectory = ".rhre3/.prefs/"
//                    }
//
//                    RHRE3.portableMode = portable
//                    RHRE3.skipGitScreen = "--skip-git" in args
//                    RHRE3.forceGitFetch = "--force-git-fetch" in args
//                    RHRE3.forceGitCheck = "--force-git-check" in args
//                    RHRE3.verifyRegistry = "--verify-registry" in args
//                    RHRE3.immediateEvent = when {
//                        "--immediate-anniversary-like-new" in args -> 2
//                        "--immediate-anniversary" in args -> 1
//                        "--immediate-xmas" in args -> 3
//                        else -> 0
//                    }
//                    RHRE3.noAnalytics = "--no-analytics" in args
//                    RHRE3.noOnlineCounter = "--no-online-counter" in args
//                    RHRE3.outputGeneratedDatamodels = "--output-generated-datamodels" in args
//                    RHRE3.outputCustomSfx = "--output-custom-sfx" in args
//                    RHRE3.showTapalongMarkers = "--show-tapalong-markers" in args
//                    RHRE3.midiRecording = "--midi-recording" in args
//                    LazySound.loadLazilyWithAssetManager = "--force-lazy-sound-load" !in args
//
//                    val sizes: List<Int> = listOf(256, 128, 64, 32, 24, 16)
//                    sizes.forEach {
//                        this.addIcon("images/icon/$it.png", Files.FileType.Internal)
//                    }
//
//                    listOf(24, 16).forEach {
//                        this.addIcon("images/icon/$it.png", Files.FileType.Internal)
//                    }
//                }
//                .launch()
    }

}
