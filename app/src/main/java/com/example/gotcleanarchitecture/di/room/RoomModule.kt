package com.example.gotcleanarchitecture.di.room

import com.example.domain.interactors.RoomInteractor
import com.example.gotcleanarchitecture.di.UI_SCHEDULER
import com.example.gotcleanarchitecture.ui.room.RoomPresenter
import dagger.Module
import dagger.Provides
import io.reactivex.rxjava3.core.Scheduler
import javax.inject.Named

@Module
class RoomModule {

    @Provides
    fun roomPresenter(
        roomIterator: RoomInteractor,
        @Named(UI_SCHEDULER) scheduler: Scheduler
    ) = RoomPresenter(roomIterator, scheduler)

}