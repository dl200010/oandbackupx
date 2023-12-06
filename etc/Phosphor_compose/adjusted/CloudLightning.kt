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

val Phosphor.CloudLightning: ImageVector
    get() {
        if (_cloud_lightning != null) {
            return _cloud_lightning!!
        }
        _cloud_lightning = Builder(
            name = "Cloud-lightning",
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
                moveTo(156.0f, 168.0f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 85.0f, 64.8f)
                arcToRelative(53.8f, 53.8f, 0.0f, false, false, -9.0f, -0.8f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 104.0f)
                horizontalLineToRelative(39.4f)
                lineTo(97.3f, 195.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 208.0f)
                horizontalLineToRelative(35.4f)
                lineToRelative(-18.1f, 27.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.4f, 8.8f)
                lineToRelative(26.2f, -40.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.4f, -8.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.1f, -4.2f)
                horizontalLineTo(118.8f)
                lineToRelative(15.8f, -24.0f)
                close()
                moveTo(40.0f, 116.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 76.0f, 80.0f)
                arcToRelative(40.3f, 40.3f, 0.0f, false, true, 4.9f, 0.3f)
                arcTo(74.9f, 74.9f, 0.0f, false, false, 80.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 60.0f, 60.0f)
                horizontalLineTo(76.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 40.0f, 116.0f)
                close()
            }
        }
            .build()
        return _cloud_lightning!!
    }

private var _cloud_lightning: ImageVector? = null



@Preview
@Composable
fun CloudLightningPreview() {
    Image(
        Phosphor.CloudLightning,
        null
    )
}
