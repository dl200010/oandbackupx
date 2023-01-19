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

val Phosphor.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(
            name = "Car", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
            viewportWidth = 256.0f, viewportHeight = 256.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(240.0f, 112.0f)
                lineTo(229.2f, 112.0f)
                lineTo(201.4f, 49.5f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 186.8f, 40.0f)
                lineTo(69.2f, 40.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -14.6f, 9.5f)
                lineTo(26.8f, 112.0f)
                lineTo(16.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(64.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(80.0f, 192.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 128.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(69.2f, 56.0f)
                lineTo(186.8f, 56.0f)
                lineToRelative(24.9f, 56.0f)
                lineTo(44.3f, 112.0f)
                close()
                moveTo(64.0f, 208.0f)
                lineTo(40.0f, 208.0f)
                lineTo(40.0f, 192.0f)
                lineTo(64.0f, 192.0f)
                close()
                moveTo(192.0f, 208.0f)
                lineTo(192.0f, 192.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(216.0f, 176.0f)
                lineTo(40.0f, 176.0f)
                lineTo(40.0f, 128.0f)
                lineTo(216.0f, 128.0f)
                close()
                moveTo(56.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(80.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(64.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 152.0f)
                close()
                moveTo(168.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(176.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 152.0f)
                close()
            }
        }
            .build()
        return _car!!
    }

private var _car: ImageVector? = null
