package io.github.chrislo27.bouncyroadmania.editor

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.InputProcessor
import io.github.chrislo27.bouncyroadmania.BRManiaApp
import io.github.chrislo27.bouncyroadmania.editor.rendering.EditorRenderer
import io.github.chrislo27.bouncyroadmania.editor.stage.EditorStage
import io.github.chrislo27.bouncyroadmania.engine.Engine
import io.github.chrislo27.bouncyroadmania.engine.PlayState
import io.github.chrislo27.toolboks.i18n.Localization
import io.github.chrislo27.toolboks.util.gdxutils.isControlDown
import io.github.chrislo27.toolboks.util.gdxutils.isShiftDown
import kotlin.properties.Delegates


class Editor(val main: BRManiaApp) : InputProcessor {

    companion object {
        const val EVENT_HEIGHT: Float = 48f
        const val EVENT_WIDTH: Float = EVENT_HEIGHT * 4
        const val TRACK_LINE_THICKNESS: Float = 2f
        internal const val NEGATIVE_SYMBOL = "-"
        internal const val ZERO_BEAT_SYMBOL = "♩"
        internal const val SELECTION_RECT_ADD = "+"
        internal const val SELECTION_RECT_INVERT = "±"
    }

    val theme: EditorTheme get() = main.editorTheme

    var editMode: EditMode by Delegates.observable(EditMode.EVENTS) { _, oldVal, newVal ->
        stage.decideVisibility()
        updateMessageBar()
    }
    val stage: EditorStage = EditorStage(this)
    val engine: Engine = Engine()
    var currentTool: Tool by Delegates.observable(Tool.SELECTION) { _, _, _ -> updateMessageBar() }
    var snap: Float = 0.25f

    val renderer: EditorRenderer = EditorRenderer(this)
    private var frameLastCallUpdateMessageBar: Long = -1

    init {
        Localization.addListener {
            updateMessageBar()
        }
    }

    fun updateMessageBar() {
        frameLastCallUpdateMessageBar = Gdx.graphics.frameId
        val message = StringBuilder()
        val controls = StringBuilder()

        when (editMode) {
            EditMode.PARAMETERS -> message.append(Localization["editor.msg.parameters"])
            else -> {}
        }

        stage.messageLabel.text = message.toString()
        stage.controlsLabel.text = controls.toString()
    }

    fun renderUpdate() {
        val shift = Gdx.input.isShiftDown()
        val ctrl = Gdx.input.isControlDown()

        if (engine.playState != PlayState.STOPPED)
            return

        if (editMode == EditMode.EVENTS) {
            if (Gdx.input.isKeyPressed(Input.Keys.A) || Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
                renderer.trackCamera.position.x -= renderer.toScaleX(Editor.EVENT_WIDTH * 5 * Gdx.graphics.deltaTime * if (shift xor ctrl) 6f else 1f)
            }
            if (Gdx.input.isKeyPressed(Input.Keys.D) || Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
                renderer.trackCamera.position.x += renderer.toScaleX(Editor.EVENT_WIDTH * 5 * Gdx.graphics.deltaTime * if (shift xor ctrl) 6f else 1f)
            }
        }

    }

    override fun touchUp(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
        return false
    }

    override fun mouseMoved(screenX: Int, screenY: Int): Boolean {
        return false
    }

    override fun keyTyped(character: Char): Boolean {
        return false
    }

    override fun scrolled(amount: Int): Boolean {
        return false
    }

    override fun keyUp(keycode: Int): Boolean {
        return false
    }

    override fun touchDragged(screenX: Int, screenY: Int, pointer: Int): Boolean {
        return false
    }

    override fun keyDown(keycode: Int): Boolean {


        return false
    }

    override fun touchDown(screenX: Int, screenY: Int, pointer: Int, button: Int): Boolean {
        return false
    }

    fun getDebugString(): String {
        return "updateMessageBar: ${Gdx.graphics.frameId - frameLastCallUpdateMessageBar}" + "\n${renderer.getDebugString()}"
    }
}