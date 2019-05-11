package io.github.chrislo27.bouncyroadmania.editor

import com.badlogic.gdx.graphics.Texture
import io.github.chrislo27.bouncyroadmania.engine.tracker.Tracker
import io.github.chrislo27.bouncyroadmania.engine.tracker.musicvolume.MusicVolumeChange
import io.github.chrislo27.bouncyroadmania.engine.tracker.tempo.TempoChange
import io.github.chrislo27.toolboks.registry.AssetRegistry
import kotlin.reflect.KClass


enum class Tool(val texId: String, val nameId: String,
                val trackerClass: KClass<out Tracker<*>>? = null, val keybinds: List<String> = listOf(),
                val showSubbeatLines: Boolean = trackerClass != null) {

    SELECTION("tool_selection", "tool.selection.name"),
    MULTIPART_SPLIT("tool_multipart_split", "tool.multipartSplit.name"),
    TEMPO_CHANGE("tool_tempo_change", "tool.tempoChange.name", trackerClass = TempoChange::class),
    MUSIC_VOLUME("tool_music_volume", "tool.musicVolume.name", trackerClass = MusicVolumeChange::class),
    TIME_SIGNATURE("tool_time_signature", "tool.timeSignature.name", showSubbeatLines = true),
    SWING("tool_swing", "tool.swing.name");

    companion object {
        val VALUES: List<Tool> by lazy { Tool.values().toList() }
    }

    val isTrackerRelated: Boolean = trackerClass != null
    val index: Int by lazy { VALUES.indexOf(this) }
    val texture: Texture
        get() = AssetRegistry[texId]

}