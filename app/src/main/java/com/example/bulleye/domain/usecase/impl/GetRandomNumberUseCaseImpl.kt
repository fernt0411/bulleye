package com.example.bulleye.domain.usecase.impl

import com.example.bulleye.domain.model.RandomNumber
import com.example.bulleye.domain.repository.api.RandomNumberRepository
import com.example.bulleye.domain.usecase.api.GetRandomNumberUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetRandomNumberUseCaseImpl @Inject constructor(
    private val randomNumberRepository: RandomNumberRepository
) : GetRandomNumberUseCase {
    override fun invoke(): Flow<Result<RandomNumber>> {
        return randomNumberRepository.getRandomNumber()
    }
}