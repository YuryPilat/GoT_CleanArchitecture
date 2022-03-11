package com.example.gotcleanarchitecture.ui

import com.example.gotcleanarchitecture.utils.moxy.RxMvpPresenter
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Scheduler
import moxy.MvpView

abstract class AppPresenter<T : MvpView>(
    private val uiScheduler: Scheduler,

): RxMvpPresenter<T>() {

    protected fun <K> Observable<K>.subscribeOnUi(onNext: (K) -> Unit, onError: (Throwable) -> Unit) {
        this.observeOn(uiScheduler)
            .subscribe(onNext, onError)
            .autoDispose()
    }

}