package io.github.chrislo27.bouncyroadmania.init

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.audio.Music
import com.badlogic.gdx.audio.Sound
import com.badlogic.gdx.graphics.Texture
import io.github.chrislo27.toolboks.registry.AssetRegistry


class InitialAssetLoader : AssetRegistry.IAssetLoader {

    override fun addManagedAssets(manager: AssetManager) {
        AssetRegistry.loadAsset<Texture>("tex_gradient", "images/game/gradient.png")
        AssetRegistry.loadAsset<Texture>("tex_ball", "images/game/ball.png")
        AssetRegistry.loadAsset<Texture>("tex_bouncer_blue", "images/game/blue.png")
        AssetRegistry.loadAsset<Texture>("tex_bouncer_red", "images/game/red.png")
        AssetRegistry.loadAsset<Texture>("tex_bouncer_yellow", "images/game/yellow.png")
        AssetRegistry.loadAsset<Texture>("tex_main_menu_gradient", "images/main_menu_gradient.png")

        AssetRegistry.loadAsset<Texture>("ui_music", "images/ui/icon/music_button.png")
        AssetRegistry.loadAsset<Texture>("ui_music_muted", "images/ui/icon/music_button_muted.png")
        AssetRegistry.loadAsset<Texture>("ui_fullscreen", "images/ui/icon/fullscreen.png")
        AssetRegistry.loadAsset<Texture>("ui_unfullscreen", "images/ui/icon/unfullscreen.png")
        AssetRegistry.loadAsset<Texture>("ui_reset_window", "images/ui/icon/reset_window.png")
        AssetRegistry.loadAsset<Texture>("ui_save_button", "images/ui/icon/save_button.png")
        AssetRegistry.loadAsset<Texture>("ui_new_button", "images/ui/icon/new_button.png")
        AssetRegistry.loadAsset<Texture>("ui_load_button", "images/ui/icon/load_button.png")
        AssetRegistry.loadAsset<Texture>("ui_folder", "images/ui/icon/folder.png")
        AssetRegistry.loadAsset<Texture>("ui_edit_mode_engine", "images/ui/icon/edit_mode_engine.png")
        AssetRegistry.loadAsset<Texture>("ui_edit_mode_events", "images/ui/icon/edit_mode_events.png")
        AssetRegistry.loadAsset<Texture>("ui_edit_mode_params", "images/ui/icon/edit_mode_params.png")
        AssetRegistry.loadAsset<Texture>("ui_pause", "images/ui/icon/pause.png")
        AssetRegistry.loadAsset<Texture>("ui_play", "images/ui/icon/play.png")
        AssetRegistry.loadAsset<Texture>("ui_stop", "images/ui/icon/stop.png")

        AssetRegistry.loadAsset<Texture>("tool_selection", "images/tool/selection.png")
        AssetRegistry.loadAsset<Texture>("tool_tempo_change", "images/tool/tempo_change.png")
        AssetRegistry.loadAsset<Texture>("tool_time_signature", "images/tool/time_signature.png")
        AssetRegistry.loadAsset<Texture>("tool_music_volume", "images/tool/music_volume.png")
        AssetRegistry.loadAsset<Texture>("tool_swing", "images/tool/swing.png")

        AssetRegistry.loadAsset<Texture>("tracker_right_tri", "images/ui/tracker_right_triangle.png")
        AssetRegistry.loadAsset<Texture>("tracker_tri", "images/ui/tracker_triangle.png")
        AssetRegistry.loadAsset<Texture>("tracker_right_tri_bordered", "images/ui/tracker_triangle_right_bordered.png")

        AssetRegistry.loadAsset<Sound>("sfx_tink", "sounds/tink.ogg")
        AssetRegistry.loadAsset<Sound>("sfx_cymbal", "sounds/cymbal.ogg")
        AssetRegistry.loadAsset<Sound>("sfx_dud_left", "sounds/dudL.wav")
        AssetRegistry.loadAsset<Sound>("sfx_dud_right", "sounds/dudR.wav")
        AssetRegistry.loadAsset<Sound>("sfx_splash", "sounds/splash.wav")
        AssetRegistry.loadAsset<Music>("music_br", "sounds/Bouncy Road.ogg")

        AssetRegistry.loadAsset<Music>("music_main_menu", "music/Balloon_Game_short.ogg")
    }

    override fun addUnmanagedAssets(assets: MutableMap<String, Any>) {
    }

}