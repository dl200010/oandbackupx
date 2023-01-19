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

val Phosphor.Checks: ImageVector
    get() {
        if (_checks != null) {
            return _checks!!
        }
        _checks = Builder(
            name = "Checks",
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
                moveTo(153.7f, 89.7f)
                lineToRelative(-88.0f, 88.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-44.0f, -44.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(60.0f, 160.7f)
                lineToRelative(82.3f, -82.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                close()
                moveTo(245.7f, 78.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 0.0f)
                lineTo(152.0f, 160.7f)
                lineTo(134.3f, 143.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 123.0f, 154.3f)
                lineToRelative(23.3f, 23.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(88.0f, -88.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 245.7f, 78.3f)
                close()
            }
        }
            .build()
        return _checks!!
    }

private var _checks: ImageVector? = null



@Preview
@Composable
fun ChecksPreview() {
    Image(
        Phosphor.Checks,
        null
    )
}
