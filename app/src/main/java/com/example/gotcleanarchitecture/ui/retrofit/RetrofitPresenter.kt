package com.example.gotcleanarchitecture.ui.retrofit

import com.example.domain.interactors.RoomInteractor
import com.example.domain.interactors.RetrofitInteractor
import com.example.domain.models.CharacterModelRetrofit
import com.example.gotcleanarchitecture.ui.AppPresenter
import io.reactivex.rxjava3.core.Scheduler

class RetrofitPresenter(
    private val retrofitInteractor: RetrofitInteractor,
    private val roomInteractor: RoomInteractor,
    scheduler: Scheduler
): AppPresenter<RetrofitView>(scheduler) {


    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        subscribeOnCharactersList()
    }

    private fun subscribeOnCharactersList() {
        retrofitInteractor.getData()
            .subscribeOnUi(this::onListReceived, this::onError)
    }

    private fun onListReceived(tasks: List<CharacterModelRetrofit>) {
        viewState.updateList(tasks)
        (tasks.indices).forEach {
            saveDataToDatabase(tasks[it])
        }
    }

    private fun onError(throwable: Throwable) {

    }

    private fun saveDataToDatabase(character: CharacterModelRetrofit) {
        roomInteractor.saveCharacter(
            fullName = character.fullName,
            house = character.family,
            title = character.title,
            imageUrl = character.imageUrl
        )
    }



}