package com.example.gotcleanarchitecture.di.retrofit

import com.example.domain.interactors.RoomInteractor
import com.example.domain.interactors.RetrofitInteractor
import com.example.gotcleanarchitecture.di.IO_SCHEDULER
import com.example.gotcleanarchitecture.di.UI_SCHEDULER
import com.example.gotcleanarchitecture.ui.retrofit.RetrofitPresenter
import dagger.Module
import dagger.Provides
import io.reactivex.rxjava3.core.Scheduler
import javax.inject.Named

@Module
class RetrofitModule {

    @Provides
    fun retrofitPresenter(
        retrofitInteractor: RetrofitInteractor,
        roomInteractor: RoomInteractor,
        @Named(UI_SCHEDULER) scheduler: Scheduler
    ) = RetrofitPresenter(retrofitInteractor,roomInteractor, scheduler)

}