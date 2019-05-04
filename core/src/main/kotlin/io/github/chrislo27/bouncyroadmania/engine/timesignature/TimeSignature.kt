package io.github.chrislo27.bouncyroadmania.engine.timesignature


class TimeSignature(val container: TimeSignatures, val beat: Float, beatsPerMeasure: Int, beatUnit: Int) {

    companion object {
        val LOWER_BEATS_PER_MEASURE = 1
        val UPPER_BEATS_PER_MEASURE = 64
        val NOTE_UNITS = listOf(2, 4, 8, 16).sorted()
        val DEFAULT_NOTE_UNIT = 4
    }

    val beatsPerMeasure: Int = beatsPerMeasure.coerceAtLeast(1)
    val beatUnit: Int = beatUnit.coerceAtLeast(1)
    val noteFraction: Float get() = 4f / beatUnit

    var measure: Int = 0

    val lowerText: String = this.beatUnit.toString()
    val upperText: String = "${this.beatsPerMeasure}"

}
