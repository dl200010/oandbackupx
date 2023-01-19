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

val Phosphor.GitlabLogo: ImageVector
    get() {
        if (_gitlab_logo != null) {
            return _gitlab_logo!!
        }
        _gitlab_logo = Builder(
            name = "Gitlab-logo",
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
                moveTo(238.3f, 152.5f)
                lineTo(211.0f, 50.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.9f, -1.1f)
                lineTo(167.5f, 104.0f)
                horizontalLineToRelative(-79.0f)
                lineTo(67.9f, 48.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 45.0f, 50.0f)
                lineTo(17.7f, 152.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 6.4f, 17.3f)
                lineToRelative(94.8f, 65.6f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, 7.1f, 2.7f)
                horizontalLineToRelative(4.0f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, 7.1f, -2.7f)
                lineToRelative(94.8f, -65.6f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 238.3f, 152.5f)
                close()
                moveTo(198.7f, 66.2f)
                lineTo(208.8f, 104.0f)
                lineTo(184.5f, 104.0f)
                close()
                moveTo(161.5f, 120.0f)
                lineTo(128.0f, 209.2f)
                lineTo(94.5f, 120.0f)
                close()
                moveTo(57.3f, 66.2f)
                lineTo(71.5f, 104.0f)
                lineTo(47.2f, 104.0f)
                close()
                moveTo(42.9f, 120.0f)
                lineTo(77.5f, 120.0f)
                lineToRelative(34.0f, 90.9f)
                lineTo(33.2f, 156.6f)
                close()
                moveTo(144.5f, 210.9f)
                lineTo(178.5f, 120.0f)
                horizontalLineToRelative(34.6f)
                lineToRelative(9.7f, 36.6f)
                close()
            }
        }
            .build()
        return _gitlab_logo!!
    }

private var _gitlab_logo: ImageVector? = null



@Preview
@Composable
fun GitlabLogoPreview() {
    Image(
        Phosphor.GitlabLogo,
        null
    )
}
