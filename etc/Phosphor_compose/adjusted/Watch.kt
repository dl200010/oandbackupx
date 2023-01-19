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

val Phosphor.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(
            name = "Watch",
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
                moveTo(208.0f, 128.0f)
                arcToRelative(80.1f, 80.1f, 0.0f, false, false, -32.7f, -64.5f)
                lineToRelative(-6.2f, -34.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 153.3f, 16.0f)
                lineTo(102.7f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 86.9f, 29.1f)
                lineTo(80.7f, 63.5f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, 129.0f)
                lineToRelative(6.2f, 34.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 102.7f, 240.0f)
                horizontalLineToRelative(50.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.8f, -13.1f)
                lineToRelative(6.2f, -34.4f)
                arcTo(80.1f, 80.1f, 0.0f, false, false, 208.0f, 128.0f)
                close()
                moveTo(102.7f, 32.0f)
                horizontalLineToRelative(50.6f)
                lineToRelative(3.9f, 21.6f)
                arcToRelative(78.9f, 78.9f, 0.0f, false, false, -58.4f, 0.0f)
                close()
                moveTo(64.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, 64.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, true, 64.0f, 128.0f)
                close()
                moveTo(153.3f, 224.0f)
                lineTo(102.7f, 224.0f)
                lineToRelative(-3.9f, -21.6f)
                arcToRelative(78.9f, 78.9f, 0.0f, false, false, 58.4f, 0.0f)
                close()
                moveTo(120.0f, 128.0f)
                lineTo(120.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(128.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f)
                close()
            }
        }
            .build()
        return _watch!!
    }

private var _watch: ImageVector? = null



@Preview
@Composable
fun WatchPreview() {
    Image(
        Phosphor.Watch,
        null
    )
}
