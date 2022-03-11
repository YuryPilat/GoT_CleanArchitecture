package com.example.gotcleanarchitecture.utils.recycler_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

open class BaseViewHolder(
    parent: ViewGroup,
    @LayoutRes layoutResId: Int
) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(layoutResId, parent, false)
)