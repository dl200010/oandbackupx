package com.machiav3lli.backup.ui.compose.icons.phosphor


import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.machiav3lli.backup.ui.compose.icons.Phosphor

val Phosphor.Layout: ImageVector
    get() {
        if (_layout != null) {
            return _layout!!
        }
        _layout = Builder(
            name = "Layout",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 256.0f,
            viewportHeight = 256.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(40.0f, 56.0f)
                lineTo(216.0f, 56.0f)
                lineTo(216.0f, 96.0f)
                lineTo(40.0f, 96.0f)
                close()
                moveTo(40.0f, 112.0f)
                lineTo(96.0f, 112.0f)
                verticalLineToRelative(88.0f)
                lineTo(40.0f, 200.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(112.0f, 200.0f)
                lineTo(112.0f, 112.0f)
                lineTo(216.0f, 112.0f)
                verticalLineToRelative(88.0f)
                close()
            }
        }
            .build()
        return _layout!!
    }

private var _layout: ImageVector? = null



@Preview
@Composable
fun LayoutPreview() {
    Image(
        Phosphor.Layout,
        null
    )
}
