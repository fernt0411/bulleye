package com.example.bulleye.domain.repository.api

import com.example.bulleye.domain.model.RandomNumber
import kotlinx.coroutines.flow.Flow

interface RandomNumberRepository {
    fun getRandomNumber(): Flow<Result<RandomNumber>>
}