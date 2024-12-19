package com.example.bulleye.presentation.game

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.bulleye.presentation.game.components.BullEyeBar
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun GameScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    viewModel: GameViewModel = hiltViewModel()
) {
    val randomNumber by viewModel.randomNumber.collectAsStateWithLifecycle()
    Column {
        RandomNumber(
            modifier = modifier,
            randomNumber = randomNumber
        )
        Spacer(modifier = modifier.height(16.dp))
        BullEyeBar(modifier = modifier)
        Spacer(modifier = modifier.height(16.dp))
        Controls(modifier = modifier, navController)
    }
}

@Composable
fun RandomNumber(
    modifier: Modifier = Modifier,
    randomNumber: Int
) {
    Text(
        modifier = modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        text = "PUT THE BULLSEYE AS CLOSE AS YOU CAN TO"
    )
    Text(
        modifier = modifier
            .fillMaxWidth(),
        textAlign = TextAlign.Center,
        fontSize = 32.sp,
        text = randomNumber.toString()
    )
}

@Composable
fun Controls(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red
                ),
                onClick = {
                },

                ) {
                Text(text = "Hit me!")
            }
        }
        Spacer(modifier = modifier.height(16.dp))
        Row(
            modifier = modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Absolute.SpaceBetween

        ) {
            ButtonRestart(modifier = modifier)
            Text(
                text = "Score\n" +
                        "1",
                textAlign = TextAlign.Center
            )
            Text(
                text = "Round\n" +
                        "1",
                textAlign = TextAlign.Center
            )
            ButtonInfo(
                modifier = modifier,
                navController = navController
            )

        }
    }

}

@Composable
fun ButtonInfo(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    FilledIconButton(
        modifier = modifier,
        shape = IconButtonDefaults.filledShape,
        colors = IconButtonDefaults.filledIconButtonColors(containerColor = Color.Black),
        onClick = {
            navController.navigate("Info")
        }
    ) {
        Icon(
            imageVector = Icons.Default.Info,
            contentDescription = "Icon",
            tint = Color.White,
        )
    }
}

@Composable
fun ButtonRestart(modifier: Modifier = Modifier) {
    FilledIconButton(
        modifier = modifier,
        onClick = { /* Handle click */ },
        shape = IconButtonDefaults.filledShape,
        colors = IconButtonDefaults.filledIconButtonColors(containerColor = Color.Black)
    ) {
        Icon(
            imageVector = Icons.Default.Refresh,
            contentDescription = "Icon",
            tint = Color.White,
        )
    }
}