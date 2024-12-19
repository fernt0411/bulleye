package com.example.bulleye.data.di

import com.example.bulleye.data.repository.impl.RandomNumberRepositoryImpl
import com.example.bulleye.data.source.api.RandomNumberSource
import com.example.bulleye.data.source.impl.RandomNumberSourceImpl
import com.example.bulleye.domain.repository.api.RandomNumberRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DataModule {
    @Binds
    abstract fun bindRandomNumberSourceImpl(source: RandomNumberSourceImpl): RandomNumberSource

    @Binds
    abstract fun bindRandomNumberRepositoryImpl(repository: RandomNumberRepositoryImpl): RandomNumberRepository
}
