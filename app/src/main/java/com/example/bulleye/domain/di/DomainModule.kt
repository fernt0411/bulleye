package com.example.bulleye.domain.di

import com.example.bulleye.domain.usecase.api.GetRandomNumberUseCase
import com.example.bulleye.domain.usecase.impl.GetRandomNumberUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class DomainModule {


    @Binds
    abstract fun bindRandomNumberRepositoryImpl(useCase: GetRandomNumberUseCaseImpl): GetRandomNumberUseCase
}