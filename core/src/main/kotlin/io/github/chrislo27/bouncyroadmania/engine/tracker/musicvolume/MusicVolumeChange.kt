package io.github.chrislo27.bouncyroadmania.engine.tracker.musicvolume

import com.badlogic.gdx.math.MathUtils
import io.github.chrislo27.bouncyroadmania.engine.tracker.Tracker
import io.github.chrislo27.bouncyroadmania.engine.tracker.TrackerContainer
import java.util.*


class MusicVolumeChange(container: TrackerContainer<MusicVolumeChange>, beat: Float, width: Float, volume: Int)
    : Tracker<MusicVolumeChange>(container, beat, width) {

    companion object {
        val MAX_VOLUME: Int = 200

        fun getFormattedText(volume: Int): String = "♬\ue13c➡$volume%"
    }

    val volume: Int = volume.coerceIn(0, MAX_VOLUME)
    val previousVolume: Int
        get() = (container.map as NavigableMap).lowerEntry(beat)?.value?.volume ?: 100

    init {
        text = getFormattedText(volume)
    }

    override fun getSlope(): Int {
        return when {
            volume > previousVolume -> 1
            volume < previousVolume -> -1
            else -> 0
        }
    }

    override fun scroll(amount: Int, control: Boolean, shift: Boolean): MusicVolumeChange? {
        val change = amount * (if (control) 5 else 1)

        if ((change < 0 && volume <= 0) || (change > 0 && volume >= MAX_VOLUME))
            return null

        return MusicVolumeChange(container, beat, width, (volume + change).coerceIn(0, MAX_VOLUME))
    }

    override fun createResizeCopy(beat: Float, width: Float): MusicVolumeChange {
        return MusicVolumeChange(container, beat, width, volume)
    }

    fun volumeAt(beat: Float): Float {
        val endBeat = this.endBeat
        return if (!isZeroWidth && beat <= endBeat) {
            MathUtils.lerp(previousVolume / 100f, volume / 100f, (beat - this.beat) / width)
        } else {
            volume / 100f
        }
    }

}