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

val Phosphor.`Piano-keys`: ImageVector
    get() {
        if (`_piano-keys` != null) {
            return `_piano-keys`!!
        }
        `_piano-keys` = Builder(
            name = "Piano-keys", defaultWidth = 256.0.dp, defaultHeight =
            256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(80.0f, 48.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(88.0f)
                lineTo(80.0f, 136.0f)
                close()
                moveTo(112.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(120.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(56.0f)
                lineTo(100.0f, 208.0f)
                lineTo(100.0f, 152.0f)
                close()
                moveTo(152.0f, 136.0f)
                lineTo(152.0f, 48.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(88.0f)
                close()
                moveTo(48.0f, 48.0f)
                lineTo(64.0f, 48.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(84.0f, 152.0f)
                verticalLineToRelative(56.0f)
                lineTo(48.0f, 208.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(172.0f, 208.0f)
                lineTo(172.0f, 152.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(192.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                lineTo(208.0f, 208.0f)
                close()
            }
        }
            .build()
        return `_piano-keys`!!
    }

private var `_piano-keys`: ImageVector? = null
