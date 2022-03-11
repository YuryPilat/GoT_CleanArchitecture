package com.example.gotcleanarchitecture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gotcleanarchitecture.databinding.ActivityMainBinding
import com.example.gotcleanarchitecture.ui.retrofit.RetrofitFragment
import com.example.gotcleanarchitecture.utils.startFragment

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
//        startFragment(RoomFragment(), supportFragmentManager, R.id.mainContainer)
        startFragment(RetrofitFragment(), supportFragmentManager, R.id.mainContainer)
    }

}