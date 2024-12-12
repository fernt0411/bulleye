package com.example.bulleye.game.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun BullEyeBar(modifier: Modifier = Modifier) {
    var sliderPosition by remember { mutableFloatStateOf(0f) }
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically
    )
    {
        Text(
            modifier = modifier
                .weight(1f),
            textAlign = TextAlign.Center,
            text = "0"

        )
        Slider(
            modifier = modifier
                .weight(8f),
            colors = SliderDefaults.colors(
                activeTickColor = Color.Red,
                activeTrackColor = Color.Red,
                inactiveTrackColor = Color.Red,
                thumbColor = Color.Red,
            ),
            valueRange = 0f..100f,
            steps = 100,
            thumb = { ThumbConcentricCircle() },
            value = sliderPosition,

            onValueChange = { sliderPosition = it }
        )
        Text(
            modifier = Modifier
                .weight(1f),
            textAlign = TextAlign.Center,
            text = "100"
        )

        //Text(text = sliderPosition.toString())
    }
}

@Composable
private fun ThumbConcentricCircle(
    modifier: Modifier = Modifier
) {
    Box(
        modifier
            .size(32.dp)
            .border(4.dp, Color.Red, CircleShape)
            .background(Color.White, CircleShape),
        contentAlignment = Alignment.Center
    )
    {
        Box(
            modifier
                .size(16.dp)
                .border(4.dp, Color.Red, CircleShape)
                .background(Color.White, CircleShape)
        )
    }
}
