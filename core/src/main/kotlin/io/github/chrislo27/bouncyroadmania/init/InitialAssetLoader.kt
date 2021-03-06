package io.github.chrislo27.bouncyroadmania.init

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver
import com.badlogic.gdx.audio.Music
import com.badlogic.gdx.audio.Sound
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import io.github.chrislo27.bouncyroadmania.soundsystem.beads.BeadsSound
import io.github.chrislo27.bouncyroadmania.soundsystem.beads.BeadsSoundLoader
import io.github.chrislo27.toolboks.registry.AssetRegistry


class InitialAssetLoader : AssetRegistry.IAssetLoader {

    override fun addManagedAssets(manager: AssetManager) {
        manager.setLoader(BeadsSound::class.java, BeadsSoundLoader(InternalFileHandleResolver()))
        
        AssetRegistry.loadAsset<Texture>("tex_ball", "images/game/ball.png")
        AssetRegistry.loadAsset<Texture>("tex_bouncer_blue", "images/game/blue.png")
        AssetRegistry.loadAsset<Texture>("tex_bouncer_red", "images/game/red.png")
        AssetRegistry.loadAsset<Texture>("tex_bouncer_yellow", "images/game/yellow.png")
        AssetRegistry.loadAsset<Texture>("tex_main_menu_gradient", "images/main_menu_gradient.png")

        AssetRegistry.loadAsset<Texture>("event_stretchable_arrow", "images/stretchable/arrow.png")

        AssetRegistry.loadAsset<Texture>("ui_checkbox_x", "images/ui/checkbox/x.png")
        AssetRegistry.loadAsset<Texture>("ui_checkbox_checked", "images/ui/checkbox/checked.png")
        AssetRegistry.loadAsset<Texture>("ui_checkbox_unchecked", "images/ui/checkbox/unchecked.png")
        AssetRegistry.loadAsset<Texture>("ui_colour_picker_arrow", "images/ui/colour_picker_arrow.png")
        AssetRegistry.loadAsset<Texture>("ui_back", "images/ui/icon/back.png")
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
        AssetRegistry.loadAsset<Texture>("ui_exit", "images/ui/icon/exit.png")
        AssetRegistry.loadAsset<Texture>("ui_stripe_board", "images/ui/stripe_board.png")
        AssetRegistry.loadAsset<Texture>("ui_selector", "images/ui/selector/generic.png")
        AssetRegistry.loadAsset<Texture>("ui_song_choose", "images/ui/icon/song_choose.png")
        AssetRegistry.loadAsset<Texture>("ui_x", "images/ui/icon/x.png")
        AssetRegistry.loadAsset<Texture>("ui_metronome", "images/ui/icon/metronome.png")
        AssetRegistry.loadAsset<Texture>("ui_warning", "images/ui/icon/warning.png")
        AssetRegistry.loadAsset<Texture>("ui_new_engine", "images/ui/icon/new_engine.png")
        AssetRegistry.loadAsset<Texture>("ui_magnifying_glass", "images/ui/icon/magnifying_glass.png")
        AssetRegistry.loadAsset<Texture>("ui_tapalong_button", "images/ui/icon/tapalong_button.png")
        AssetRegistry.loadAsset<Texture>("ui_arrow_up", "images/ui/icon/arrow_up.png")
        AssetRegistry.loadAsset<Texture>("ui_swap", "images/ui/icon/swap.png")
        AssetRegistry.loadAsset<Texture>("ui_daytime", "images/ui/icon/daytime.png")
        AssetRegistry.loadAsset<Texture>("ui_nighttime", "images/ui/icon/nighttime.png")
        AssetRegistry.loadAsset<Texture>("ui_textbox", "images/ui/textbox.png")

        AssetRegistry.loadAsset<Texture>("tool_selection", "images/tool/selection.png")
        AssetRegistry.loadAsset<Texture>("tool_tempo_change", "images/tool/tempo_change.png")
        AssetRegistry.loadAsset<Texture>("tool_time_signature", "images/tool/time_signature.png")
        AssetRegistry.loadAsset<Texture>("tool_music_volume", "images/tool/music_volume.png")
        AssetRegistry.loadAsset<Texture>("tool_swing", "images/tool/swing.png")

        AssetRegistry.loadAsset<Texture>("tracker_right_tri", "images/ui/tracker_right_triangle.png")
        AssetRegistry.loadAsset<Texture>("tracker_tri", "images/ui/tracker_triangle.png")
        AssetRegistry.loadAsset<Texture>("tracker_right_tri_bordered", "images/ui/tracker_triangle_right_bordered.png")

        AssetRegistry.loadAsset<BeadsSound>("sfx_tink", "sounds/tink.ogg")
        AssetRegistry.loadAsset<BeadsSound>("sfx_cymbal", "sounds/cymbal.ogg")
        AssetRegistry.loadAsset<BeadsSound>("sfx_dud_left", "sounds/dudL.wav")
        AssetRegistry.loadAsset<BeadsSound>("sfx_dud_right", "sounds/dudR.wav")
        AssetRegistry.loadAsset<BeadsSound>("sfx_splash", "sounds/splash.wav")
        AssetRegistry.loadAsset<BeadsSound>("sfx_cowbell", "sounds/cowbell.ogg")
        AssetRegistry.loadAsset<Sound>("sfx_robot_on", "sounds/robot_on.ogg")
        AssetRegistry.loadAsset<Sound>("sfx_robot_off", "sounds/robot_off.ogg")
//        AssetRegistry.loadAsset<Music>("music_br", "sounds/Bouncy Road.ogg")

        AssetRegistry.loadAsset<Music>("music_main_menu", "music/Balloon_Game_short.ogg")
        AssetRegistry.loadAsset<Music>("music_play_screen", "music/Faster_Does_It.ogg")
    }

    override fun addUnmanagedAssets(assets: MutableMap<String, Any>) {
        assets["cursor_horizontal_resize"] =
                Gdx.graphics.newCursor(Pixmap(Gdx.files.internal("images/cursor/horizontal_resize.png")), 16, 8)
    }

}