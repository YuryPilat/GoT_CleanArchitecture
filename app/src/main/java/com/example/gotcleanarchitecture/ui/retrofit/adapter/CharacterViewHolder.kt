package com.example.gotcleanarchitecture.ui.retrofit.adapter

import android.view.ViewGroup
import com.example.domain.models.CharacterModelRetrofit
import com.example.gotcleanarchitecture.R
import com.example.gotcleanarchitecture.databinding.ItemCharactRetrofitBinding
import com.example.gotcleanarchitecture.utils.recycler_view.BaseViewHolder
import com.squareup.picasso.Picasso


class CharacterViewHolder(
    parent: ViewGroup,
): BaseViewHolder(parent, R.layout.item_charact_retrofit) {

    private val viewBinding = ItemCharactRetrofitBinding.bind(itemView)

    fun bind(character: CharacterModelRetrofit) {
        viewBinding.tvName.text = character.fullName
        viewBinding.tvHouse.text = character.family
        viewBinding.tvTitle.text = character.title
        Picasso
            .get()
            .load(character.imageUrl)
            .into(viewBinding.avatar)
    }

}