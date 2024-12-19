package com.example.bulleye.domain.usecase.api

import com.example.bulleye.domain.model.RandomNumber
import kotlinx.coroutines.flow.Flow

interface GetRandomNumberUseCase {
    operator fun invoke(): Flow<Result<RandomNumber>>
}