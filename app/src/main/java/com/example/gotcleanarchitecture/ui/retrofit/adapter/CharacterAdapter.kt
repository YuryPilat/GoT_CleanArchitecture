package com.example.gotcleanarchitecture.ui.retrofit.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.domain.models.CharacterModelRetrofit
import com.example.gotcleanarchitecture.utils.recycler_view.diff_utils.SimpleDiffItemCallback


class CharacterAdapter: ListAdapter<CharacterModelRetrofit, CharacterViewHolder>(SimpleDiffItemCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        return CharacterViewHolder(parent)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}