package io.github.chrislo27.bouncyroadmania.editor.stage

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.TextureRegion
import io.github.chrislo27.bouncyroadmania.editor.EditMode
import io.github.chrislo27.bouncyroadmania.engine.PlayState
import io.github.chrislo27.bouncyroadmania.screen.EditorScreen
import io.github.chrislo27.toolboks.registry.AssetRegistry
import io.github.chrislo27.toolboks.ui.*


class ToolbarStage(parent: EditorStage, palette: UIPalette)
    : Stage<EditorScreen>(parent, parent.camera, parent.pixelsWidth, parent.pixelsHeight) {

    init {
        elements += ColourPane(this, this).apply {
            this.colour.set(0f, 0f, 0f, 0.5f)
        }
        val editor = parent.editor

        val buttonSize = 32f
        val buttonPadding = 6f
        this.elements += Button(palette, this, this).apply {
            this.location.set(0f, 1f, 0f, 0f, pixelX = buttonPadding,
                    pixelWidth = buttonSize, pixelHeight = buttonSize, pixelY = -(4f + buttonSize))
            this.addLabel(ImageLabel(palette, this, this.stage).apply {
                this.image = TextureRegion(AssetRegistry.get<Texture>("ui_new_button"))
            })
            this.tooltipText = "New"
        }
        this.elements += Button(palette, this, this).apply {
            this.location.set(0f, 1f, 0f, 0f, pixelX = buttonPadding * 2 + buttonSize,
                    pixelWidth = buttonSize, pixelHeight = buttonSize, pixelY = -(4f + buttonSize))
            this.addLabel(ImageLabel(palette, this, this.stage).apply {
                this.image = TextureRegion(AssetRegistry.get<Texture>("ui_load_button"))
            })
            this.tooltipText = "Open"
        }
        this.elements += Button(palette, this, this).apply {
            this.location.set(0f, 1f, 0f, 0f, pixelX = buttonPadding * 3 + buttonSize * 2,
                    pixelWidth = buttonSize, pixelHeight = buttonSize, pixelY = -(4f + buttonSize))
            this.addLabel(ImageLabel(palette, this, this.stage).apply {
                this.image = TextureRegion(AssetRegistry.get<Texture>("ui_save_button"))
            })
            this.tooltipText = "Save"
        }

        // Separator
        this.elements += ColourPane(this, this).apply {
            this.colour.set(1f, 1f, 1f, 0.5f)
            this.location.set(0f, 0f, 0f, 0f, buttonPadding * 3 + buttonSize * 2 + buttonSize + buttonPadding * 1f - 1f, 2f, 2f, 36f)
        }

        // Separator
        this.elements += ColourPane(this, this).apply {
            this.colour.set(1f, 1f, 1f, 0.5f)
            this.location.set(0f, 0f, 0f, 0f, 640f - buttonSize / 2f - buttonSize - buttonPadding * 2f + 1f, 2f, 2f, 36f)
        }

        this.elements += PlaybackButton(PlayState.PLAYING, editor, palette, this, this).apply {
            this.location.set(0f, 1f, 0f, 0f, pixelX = 640f - buttonSize / 2f,
                    pixelWidth = buttonSize, pixelHeight = buttonSize, pixelY = -(4f + buttonSize))
            this.addLabel(ImageLabel(palette, this, this.stage).apply {
                this.image = TextureRegion(AssetRegistry.get<Texture>("ui_play"))
                this.tint = Color.valueOf("00A810")
            })
        }
        this.elements += PlaybackButton(PlayState.PAUSED, editor, palette, this, this).apply {
            this.location.set(0f, 1f, 0f, 0f, pixelX = 640f - buttonSize / 2f - buttonSize - buttonPadding,
                    pixelWidth = buttonSize, pixelHeight = buttonSize, pixelY = -(4f + buttonSize))
            this.addLabel(ImageLabel(palette, this, this.stage).apply {
                this.image = TextureRegion(AssetRegistry.get<Texture>("ui_pause"))
                this.tint = Color.valueOf("E8D140")
            })
        }
        this.elements += PlaybackButton(PlayState.STOPPED, editor, palette, this, this).apply {
            this.location.set(0f, 1f, 0f, 0f, pixelX = 640f - buttonSize / 2f + buttonSize + buttonPadding,
                    pixelWidth = buttonSize, pixelHeight = buttonSize, pixelY = -(4f + buttonSize))
            this.addLabel(ImageLabel(palette, this, this.stage).apply {
                this.image = TextureRegion(AssetRegistry.get<Texture>("ui_stop"))
                this.tint = Color.valueOf("ED0000")
            })
        }

        // Separator
        this.elements += ColourPane(this, this).apply {
            this.colour.set(1f, 1f, 1f, 0.5f)
            this.location.set(0f, 0f, 0f, 0f, 640f - buttonSize / 2f + buttonSize * 2 + buttonPadding * 2 - 1f, 2f, 2f, 36f)
        }

        this.elements += EditModeButton(EditMode.ENGINE, editor, palette, this, this).apply {
            this.location.set(0f, 1f, 0f, 0f, pixelX = 640f - buttonSize / 2f + buttonSize * 2 + buttonPadding * 3,
                    pixelWidth = buttonSize, pixelHeight = buttonSize, pixelY = -(4f + buttonSize))
            this.addLabel(ImageLabel(palette, this, this.stage).apply {
                this.image = TextureRegion(AssetRegistry.get<Texture>("ui_edit_mode_engine"))
            })
        }
        this.elements += EditModeButton(EditMode.EVENTS, editor, palette, this, this).apply {
            this.location.set(0f, 1f, 0f, 0f, pixelX = 640f - buttonSize / 2f + buttonSize * 3 + buttonPadding * 4,
                    pixelWidth = buttonSize, pixelHeight = buttonSize, pixelY = -(4f + buttonSize))
            this.addLabel(ImageLabel(palette, this, this.stage).apply {
                this.image = TextureRegion(AssetRegistry.get<Texture>("ui_edit_mode_events"))
            })
        }
        this.elements += EditModeButton(EditMode.PARAMETERS, editor, palette, this, this).apply {
            this.location.set(0f, 1f, 0f, 0f, pixelX = 640f - buttonSize / 2f + buttonSize * 4 + buttonPadding * 5,
                    pixelWidth = buttonSize, pixelHeight = buttonSize, pixelY = -(4f + buttonSize))
            this.addLabel(ImageLabel(palette, this, this.stage).apply {
                this.image = TextureRegion(AssetRegistry.get<Texture>("ui_edit_mode_params"))
            })
        }
    }

}