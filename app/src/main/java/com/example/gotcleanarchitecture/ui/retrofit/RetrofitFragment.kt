package com.example.gotcleanarchitecture.ui.retrofit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.models.CharacterModelRetrofit
import com.example.gotcleanarchitecture.R
import com.example.gotcleanarchitecture.databinding.FragmentRetrofitBinding
import com.example.gotcleanarchitecture.di.Components
import com.example.gotcleanarchitecture.ui.retrofit.adapter.CharacterAdapter
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter


class RetrofitFragment : MvpAppCompatFragment(), RetrofitView {

    private lateinit var viewBinding : FragmentRetrofitBinding
    private val adapter = CharacterAdapter()

    private val presenter by moxyPresenter {
        Components.retrofitComponent().retrofitPresenter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentRetrofitBinding.inflate(inflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dividerItemDecoration = DividerItemDecoration(requireContext(), RecyclerView.VERTICAL)
        ContextCompat.getDrawable(requireContext(), R.drawable.divider_drawable)?.let {
            dividerItemDecoration.setDrawable(
                it
            )
        }
        viewBinding.recyclerview.addItemDecoration(dividerItemDecoration)
        viewBinding.recyclerview.layoutManager = LinearLayoutManager(requireContext())
        viewBinding.recyclerview.adapter = adapter
    }

    override fun updateList(characterListRoom: List<CharacterModelRetrofit>) {
        if (viewBinding.progressbar.visibility == VISIBLE) viewBinding.progressbar.visibility = GONE
          adapter.submitList(characterListRoom)
    }

}