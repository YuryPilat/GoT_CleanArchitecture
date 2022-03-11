package com.example.gotcleanarchitecture.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun startFragment(
    fragment: Fragment,
    fragmentManager: FragmentManager,
    container: Int
) {
    val existFragment = fragmentManager.findFragmentById(container)
    if (existFragment == null || existFragment.javaClass != fragment.javaClass) {
        fragmentManager.beginTransaction()
            .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
            .replace(container, fragment)
            .commit()
    }
}