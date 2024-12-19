package com.example.bulleye.presentation.game

import com.example.bulleye.domain.model.RandomNumber

sealed class GameUiState {

    data object Loading : GameUiState()
    data class Success(val randomNumber: RandomNumber) : GameUiState()
    data class Error(val message: String) : GameUiState()
}