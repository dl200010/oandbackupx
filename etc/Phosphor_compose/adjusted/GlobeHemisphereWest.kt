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

val Phosphor.GlobeHemisphereWest: ImageVector
    get() {
        if (_globe_hemisphere_west != null) {
            return _globe_hemisphere_west!!
        }
        _globe_hemisphere_west = Builder(
            name = "Globe-hemisphere-west",
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
                moveTo(221.6f, 173.3f)
                arcTo(102.9f, 102.9f, 0.0f, false, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 154.8f, 27.5f)
                horizontalLineToRelative(-0.5f)
                arcTo(103.8f, 103.8f, 0.0f, false, false, 60.4f, 49.0f)
                lineToRelative(-1.3f, 1.2f)
                arcTo(103.9f, 103.9f, 0.0f, false, false, 128.0f, 232.0f)
                horizontalLineToRelative(2.4f)
                arcTo(104.3f, 104.3f, 0.0f, false, false, 221.0f, 174.6f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(89.3f, 89.3f, 0.0f, false, true, -5.5f, 30.7f)
                lineToRelative(-46.4f, -28.5f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, false, -6.3f, -2.3f)
                lineToRelative(-22.8f, -3.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -15.3f, 6.8f)
                horizontalLineToRelative(-8.6f)
                lineToRelative(-3.8f, -7.9f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -11.0f, -8.7f)
                lineToRelative(-6.6f, -1.4f)
                lineToRelative(4.6f, -10.8f)
                horizontalLineToRelative(21.4f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 7.7f, -2.0f)
                lineToRelative(12.2f, -6.8f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 3.0f, -2.1f)
                lineToRelative(26.9f, -24.4f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 170.0f, 50.7f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 128.0f)
                close()
                moveTo(147.2f, 42.1f)
                lineToRelative(7.6f, 13.7f)
                lineTo(127.9f, 80.1f)
                lineToRelative(-12.2f, 6.8f)
                lineTo(94.3f, 86.9f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -14.7f, 9.8f)
                lineToRelative(-5.3f, 12.4f)
                lineTo(63.4f, 79.9f)
                lineToRelative(8.1f, -19.3f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 75.7f, -18.5f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(87.1f, 87.1f, 0.0f, false, true, 9.5f, -39.7f)
                lineToRelative(10.4f, 27.9f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 11.6f, 10.0f)
                lineToRelative(5.5f, 1.2f)
                horizontalLineToRelative(0.1f)
                lineToRelative(15.8f, 3.4f)
                lineToRelative(3.8f, 7.9f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, 14.4f, 9.0f)
                horizontalLineToRelative(1.2f)
                lineToRelative(-7.7f, 17.2f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 2.8f, 17.4f)
                lineToRelative(18.8f, 20.4f)
                lineToRelative(-2.5f, 13.2f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(140.1f, 215.2f)
                lineTo(141.9f, 205.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -3.9f, -13.9f)
                lineToRelative(-18.8f, -20.3f)
                lineToRelative(12.7f, -28.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(1.0f, -2.1f)
                lineToRelative(22.8f, 3.1f)
                lineToRelative(47.8f, 29.4f)
                arcTo(88.5f, 88.5f, 0.0f, false, true, 140.1f, 215.2f)
                close()
            }
        }
            .build()
        return _globe_hemisphere_west!!
    }

private var _globe_hemisphere_west: ImageVector? = null



@Preview
@Composable
fun GlobeHemisphereWestPreview() {
    Image(
        Phosphor.GlobeHemisphereWest,
        null
    )
}
