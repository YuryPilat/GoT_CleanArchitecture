package com.example.gotcleanarchitecture.ui.room

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.domain.models.CharacterModelRoom
import com.example.gotcleanarchitecture.databinding.FragmentRoomBinding
import com.example.gotcleanarchitecture.di.Components
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter


class RoomFragment : MvpAppCompatFragment(), RoomView {

    private lateinit var viewBinding:FragmentRoomBinding

    private val presenter by moxyPresenter {
        Components.roomComponent().roomPresenter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentRoomBinding.inflate(inflater, container, false)

        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun updateList(characterListRoom: List<CharacterModelRoom>) {

    }

}