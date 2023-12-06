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

val Phosphor.HandbagSimple: ImageVector
    get() {
        if (_handbag_simple != null) {
            return _handbag_simple!!
        }
        _handbag_simple = Builder(
            name = "Handbag-simple",
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
                moveTo(239.0f, 206.2f)
                lineToRelative(-14.3f, -128.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 208.8f, 64.0f)
                horizontalLineTo(175.3f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -94.6f, 0.0f)
                horizontalLineTo(47.2f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 31.3f, 78.2f)
                lineTo(17.0f, 206.2f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 4.0f, 12.5f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 32.9f, 224.0f)
                horizontalLineTo(223.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 11.9f, -5.3f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 239.0f, 206.2f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 31.0f, 24.0f)
                horizontalLineTo(97.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(32.9f, 208.0f)
                lineTo(47.2f, 80.0f)
                horizontalLineTo(208.8f)
                lineToRelative(14.3f, 128.0f)
                close()
            }
        }
            .build()
        return _handbag_simple!!
    }

private var _handbag_simple: ImageVector? = null



@Preview
@Composable
fun HandbagSimplePreview() {
    Image(
        Phosphor.HandbagSimple,
        null
    )
}
