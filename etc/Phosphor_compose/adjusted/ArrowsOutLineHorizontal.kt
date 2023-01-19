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

val Phosphor.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrows_out_line_horizontal != null) {
            return _arrows_out_line_horizontal!!
        }
        _arrows_out_line_horizontal = Builder(
            name = "Arrows-out-line-horizontal",
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
                moveTo(136.0f, 40.0f)
                lineTo(136.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(96.0f, 120.0f)
                lineTo(35.3f, 120.0f)
                lineToRelative(18.4f, -18.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 42.3f, 90.3f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(35.3f, 136.0f)
                lineTo(96.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(245.7f, 122.3f)
                lineTo(213.7f, 90.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineTo(220.7f, 120.0f)
                lineTo(160.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(60.7f)
                lineToRelative(-18.4f, 18.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 245.7f, 122.3f)
                close()
            }
        }
            .build()
        return _arrows_out_line_horizontal!!
    }

private var _arrows_out_line_horizontal: ImageVector? = null



@Preview
@Composable
fun ArrowsOutLineHorizontalPreview() {
    Image(
        Phosphor.ArrowsOutLineHorizontal,
        null
    )
}
