package com.example.counter

import android.health.connect.datatypes.ExerciseCompletionGoal
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.counter.ui.theme.BtnSize
import com.example.counter.ui.theme.CommonPaddingMin
import com.example.counter.ui.theme.CommonPaddingNano
import com.example.counter.ui.theme.CounterTheme
import com.example.counter.ui.theme.Red200
import com.example.counter.ui.theme.Red500
import com.example.counter.ui.theme.Red700
import com.example.counter.ui.theme.Red900
import com.example.counter.ui.theme.Typography

@Preview(showBackground = true)
@Composable
fun ButtonsPreview() {
    CounterTheme() {
        ButtonView(modifier = Modifier.padding(top = 24.dp), {}, {})
    }
}

@Composable
fun ButtonView(modifier: Modifier, onClick: () -> Unit, onLongClick: () -> Unit) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val startColor = if (isPressed) Red700 else Red500
    val endColor = if (isPressed) Red500 else Red200
    val strokeColor = if (isPressed) Red900 else Red700
    Surface(
        shape = CircleShape,
        border = BorderStroke(CommonPaddingNano, strokeColor),
        modifier = modifier

            .size(BtnSize)
            .clip(CircleShape)
            .combinedClickable(
                interactionSource = interactionSource,
                indication = ripple(),
                onClick = onClick,
                onLongClick = onLongClick
            )
    ) {

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(startColor, endColor),
                        center = Offset.Unspecified,
                        radius = Float.POSITIVE_INFINITY
                    )
                )
                .padding(CommonPaddingMin)
        ) {
            Text(
                text = stringResource(R.string.btn_suma),
                style = Typography.headlineLarge,
                color = Color.White
            )
        }
    }
}

