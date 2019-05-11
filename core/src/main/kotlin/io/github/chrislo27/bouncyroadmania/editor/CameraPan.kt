package io.github.chrislo27.bouncyroadmania.editor

import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.math.Interpolation

class CameraPan(val startX: Float, val endX: Float,
                val duration: Float,
                val interpolationX: Interpolation) {

    private var timeElapsed: Float = 0f

    val progress: Float
        get() = (timeElapsed / duration).coerceIn(0f, 1f)

    val done: Boolean
        get() = progress >= 1f

    fun update(delta: Float, camera: OrthographicCamera) {
        timeElapsed += delta

        if (startX != endX) {
            camera.position.x = interpolationX.apply(startX, endX, progress)
        }
    }

    override fun toString(): String {
        return "[start=${Editor.THREE_DECIMAL_PLACES_FORMATTER.format(startX)}, end=${Editor.THREE_DECIMAL_PLACES_FORMATTER.format(endX)}, duration=${Editor.THREE_DECIMAL_PLACES_FORMATTER.format(duration)}, progress=${Editor.THREE_DECIMAL_PLACES_FORMATTER.format(progress)}]"
    }

}
