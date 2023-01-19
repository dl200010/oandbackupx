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

val Phosphor.ShieldSlash: ImageVector
    get() {
        if (_shield_slash != null) {
            return _shield_slash!!
        }
        _shield_slash = Builder(
            name = "Shield-slash",
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
                moveTo(228.4f, 226.6f)
                lineToRelative(-35.0f, -38.5f)
                horizontalLineToRelative(0.0f)
                lineTo(39.4f, 18.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, -0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -0.5f, 11.3f)
                lineTo(39.5f, 42.5f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 89.4f, 75.8f, 119.1f, 91.0f, 124.1f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 10.0f, 0.0f)
                arcToRelative(146.4f, 146.4f, 0.0f, false, false, 54.4f, -33.5f)
                lineToRelative(29.2f, 32.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.9f, 2.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 228.4f, 226.6f)
                close()
                moveTo(128.0f, 223.6f)
                curveToRelative(-13.5f, -4.5f, -80.0f, -30.6f, -80.0f, -108.9f)
                lineTo(48.0f, 56.0f)
                horizontalLineToRelative(3.8f)
                lineTo(176.6f, 193.4f)
                arcTo(129.4f, 129.4f, 0.0f, false, true, 128.0f, 223.6f)
                close()
                moveTo(90.5f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(208.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 19.7f, -3.8f, 38.0f, -11.2f, 54.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.6f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.0f, -10.6f)
                curveToRelative(6.5f, -14.3f, 9.8f, -30.3f, 9.8f, -47.7f)
                lineTo(208.0f, 56.0f)
                lineTo(98.5f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 90.5f, 48.0f)
                close()
            }
        }
            .build()
        return _shield_slash!!
    }

private var _shield_slash: ImageVector? = null



@Preview
@Composable
fun ShieldSlashPreview() {
    Image(
        Phosphor.ShieldSlash,
        null
    )
}
