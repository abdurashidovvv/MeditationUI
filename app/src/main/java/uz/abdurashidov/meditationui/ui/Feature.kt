package uz.abdurashidov.meditationui.ui

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Feature(
    var title: String,
    @DrawableRes val iconId: Int,
    var lightColor:Color,
    var mediumColor:Color,
    var darkColor:Color,
)
