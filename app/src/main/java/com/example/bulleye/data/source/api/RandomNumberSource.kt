package com.example.bulleye.data.source.api

import com.example.bulleye.data.response.RandomNumberResponse

interface RandomNumberSource {
    suspend fun getRandomNumber(): Result<RandomNumberResponse>
}
