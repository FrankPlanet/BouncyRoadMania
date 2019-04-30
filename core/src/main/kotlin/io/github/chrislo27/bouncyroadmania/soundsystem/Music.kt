package io.github.chrislo27.bouncyroadmania.soundsystem

import com.badlogic.gdx.utils.Disposable


interface Music : Disposable {

    fun play()

    fun stop()

    fun pause()

    fun getPosition(): Float

    fun setPosition(seconds: Float)

    fun getVolume(): Float

    fun setVolume(vol: Float)

    fun getPitch(): Float

    fun setPitch(pitch: Float)

    fun update(delta: Float)

    fun isPlaying(): Boolean

    fun getStartOfSound(): Float

}