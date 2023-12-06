package com.machiav3lli.backup.ui.compose.icons.phosphor

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

val Phosphor.`Arrow-fat-right`: ImageVector
    get() {
        if (`_arrow-fat-right` != null) {
            return `_arrow-fat-right`!!
        }
        `_arrow-fat-right` = Builder(
            name = "Arrow-fat-right", defaultWidth = 256.0.dp,
            defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(237.7f, 122.3f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -8.8f, -1.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 32.0f)
                verticalLineTo(72.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.9f, 7.4f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.1f, 0.6f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                lineToRelative(96.0f, -96.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 237.7f, 122.3f)
                close()
                moveTo(144.0f, 204.7f)
                verticalLineTo(176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(88.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(51.3f)
                lineTo(220.7f, 128.0f)
                close()
            }
        }
            .build()
        return `_arrow-fat-right`!!
    }

private var `_arrow-fat-right`: ImageVector? = null
