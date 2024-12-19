package com.example.bulleye.data.source.impl

import com.example.bulleye.data.response.RandomNumberResponse
import com.example.bulleye.data.source.api.RandomNumberSource
import com.example.bulleye.domain.model.RandomNumber
import kotlinx.coroutines.delay
import javax.inject.Inject

class RandomNumberSourceImpl @Inject constructor() : RandomNumberSource {

    override suspend fun getRandomNumber(): Result<RandomNumberResponse> {
        val randomNumber = (1..100).random()
        val randomNumberResponse = RandomNumberResponse(
            number = randomNumber,
            description = "Try to guess the number in 20 seconds"
        )
        if (randomNumber > 88) {
            return Result.failure(Throwable())
        }
        return Result.success(randomNumberResponse)
    }

}