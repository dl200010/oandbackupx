package com.machiav3lli.backup.ui.compose

import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout
import com.machiav3lli.backup.preferences.pref_useSelectableText
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import kotlin.reflect.KProperty

fun Modifier.vertical() = layout { measurable, constraints ->
    val placeable = measurable.measure(constraints)
    layout(placeable.height, placeable.width) {
        placeable.place(
            x = -(placeable.width / 2 - placeable.height / 2),
            y = -(placeable.height / 2 - placeable.width / 2)
        )
    }
}

fun Modifier.ifThen(boolean: Boolean, modifier: Modifier.() -> Modifier): Modifier {
    return if (boolean) {
        modifier.invoke(this)
    } else {
        this
    }
}

@Composable
fun SelectionContainerX(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    if (pref_useSelectableText.value)
        SelectionContainer(modifier = modifier, content = content)
    else
        content()
}

class MutableComposableSharedFlow<T>(var initial : T, val scope : CoroutineScope)
{
    var flow = MutableSharedFlow<T>()

    var state = flow.stateIn(
        scope,
        SharingStarted.Lazily,
        initial
    )

    var value: T
        get()           { return state.value }
        set(value: T)   { scope.launch { flow.emit(value) } }

    operator fun getValue(t: Any?, property: KProperty<*>): T {
        return value
    }

    operator fun setValue(t: Any?, property: KProperty<*>, aValue: T) {
        initial = aValue
        value = aValue
    }
}

