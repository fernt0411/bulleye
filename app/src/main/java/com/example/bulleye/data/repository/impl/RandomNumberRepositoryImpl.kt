package com.example.bulleye.data.repository.impl

import com.example.bulleye.data.mapper.toDomain
import com.example.bulleye.data.source.api.RandomNumberSource
import com.example.bulleye.domain.model.RandomNumber
import com.example.bulleye.domain.repository.api.RandomNumberRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class RandomNumberRepositoryImpl @Inject constructor(
    private val randomNumberSource: RandomNumberSource,
    ) : RandomNumberRepository {

    override fun getRandomNumber(): Flow<Result<RandomNumber>> = flow {
        emit(
            randomNumberSource.getRandomNumber().mapCatching { randomNumber ->
                randomNumber.toDomain()
            }
        )
    }.flowOn(Dispatchers.IO)
}