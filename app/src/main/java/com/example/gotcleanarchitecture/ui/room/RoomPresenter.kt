package com.example.gotcleanarchitecture.ui.room

import com.example.domain.interactors.RoomInteractor
import com.example.domain.models.CharacterModelRoom
import com.example.gotcleanarchitecture.ui.AppPresenter
import io.reactivex.rxjava3.core.Scheduler

class RoomPresenter(
    private val roomInteractor: RoomInteractor,
    scheduler: Scheduler
): AppPresenter<RoomView>(scheduler) {


    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        subscribeOnCharactersDB()
    }

   private fun subscribeOnCharactersDB() {
        roomInteractor.getAllCharactersObservable()
            .subscribeOnUi(this::onListReceived, this::onError)
    }

    private fun onListReceived(charactersList: List<CharacterModelRoom>) {
        viewState.updateList(charactersList)
    }

    private fun onError(throwable: Throwable) {

    }
}