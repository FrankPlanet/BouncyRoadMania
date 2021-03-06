package io.github.chrislo27.bouncyroadmania.registry

import io.github.chrislo27.bouncyroadmania.engine.event.DeployEvent
import io.github.chrislo27.bouncyroadmania.engine.event.EndEvent
import io.github.chrislo27.bouncyroadmania.engine.event.GradientChangeEvent


object EventRegistry {

    val map: Map<String, Instantiator>
    val list: List<Instantiator>

    init {
        val tempMap = mutableMapOf<String, Instantiator>()
        val tempList = mutableListOf<Instantiator>()

        fun add(instantiator: Instantiator) {
            tempMap[instantiator.id] = instantiator
            instantiator.deprecatedIDs.forEach { tempMap[it] = instantiator }
            tempList += instantiator
        }

        add(Instantiator("deploy", listOf(), "instantiator.deploy.name", true, "instantiator.deploy.summary", true, "instantiator.deploy.desc", true) { engine ->
            DeployEvent(engine, this)
        })
        add(Instantiator("end", listOf(), "instantiator.end.name", true, "instantiator.end.summary", true, "instantiator.end.desc", true) { engine ->
            EndEvent(engine, this)
        })
        add(Instantiator("gradient_start", listOf(), "instantiator.gradient_start.name", true, "instantiator.gradient_start.summary", true, "instantiator.gradient_start.desc", true) { engine ->
            GradientChangeEvent(engine, this, true).apply {
                this.color.set(engine.gradientStart)
                this.onColorChange()
            }
        })
        add(Instantiator("gradient_end", listOf(), "instantiator.gradient_end.name", true, "instantiator.gradient_end.summary", true, "instantiator.gradient_end.desc", true) { engine ->
            GradientChangeEvent(engine, this, false).apply {
                this.color.set(engine.gradientEnd)
                this.onColorChange()
            }
        })

        map = tempMap
        list = tempList
    }

}