package com.example.gotcleanarchitecture.di

import android.content.Context
import com.example.data.database.dao.CharacterDAOWrapper
import com.example.data.repositories.RoomRepositoryImpl
import com.example.data.repositories.RetrofitRepositoryImpl
import com.example.domain.interactors.RoomInteractor
import com.example.domain.interactors.RetrofitInteractor
import com.example.domain.repositories.RoomRepository
import com.example.domain.repositories.RetrofitRepository
import dagger.Module
import dagger.Provides
import io.reactivex.rxjava3.core.Scheduler
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule(private val appContext: Context) {

    @Provides
    fun provideAppContext() = appContext

    @Provides
    @Singleton
    fun characterInteractor(
        roomRepository: RoomRepository,
    ) = RoomInteractor(roomRepository)

    @Provides
    @Singleton
    fun retrofitInteractor(
        retrofitRepository: RetrofitRepository,
        roomRepository : RoomRepository
    ) = RetrofitInteractor(retrofitRepository, roomRepository)

    @Provides
    @Singleton
    fun characterRepository(
        characterDaoWrapper: CharacterDAOWrapper,
        @Named(IO_SCHEDULER) scheduler: Scheduler
    ): RoomRepository = RoomRepositoryImpl(characterDaoWrapper, scheduler)

    @Provides
    @Singleton
    fun retrofitRepository(@Named(IO_SCHEDULER) scheduler: Scheduler
    ): RetrofitRepository = RetrofitRepositoryImpl(scheduler)

}