package com.example.bulleye.presentation.game

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bulleye.domain.model.RandomNumber
import com.example.bulleye.domain.usecase.api.GetRandomNumberUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class GameViewModel @Inject constructor(
    private val getRandomNumberUseCase: GetRandomNumberUseCase
) : ViewModel() {


    private val _uiState = MutableStateFlow<GameUiState>(GameUiState.Loading)
    val uiState: StateFlow<GameUiState> = _uiState
    private val _randomNumber = MutableStateFlow(0)
    val randomNumber: StateFlow<Int> = _randomNumber

    init {
        generateRandomNumber()
    }

    //private fun generateRandomNumber() {
    //    _randomNumber.value  = ((1..100).random())
    //}

    private fun generateRandomNumber() {
        _uiState.value = GameUiState.Loading
        viewModelScope.launch {
            getRandomNumberUseCase.invoke().map { result ->
                result.onSuccess {

                }
                result.fold(
                    onSuccess = {

                       // _uiState.update {
//
                       //     //GameUiState.Success(it)
                       // }
                    },
                    onFailure = {}
                )
            }

        }
    }


}