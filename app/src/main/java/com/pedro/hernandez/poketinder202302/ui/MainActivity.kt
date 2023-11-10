package com.pedro.hernandez.poketinder202302.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.DefaultItemAnimator
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pedro.hernandez.poketinder202302.R
import com.pedro.hernandez.poketinder202302.adapter.PokemonAdapter
import com.pedro.hernandez.poketinder202302.data.model.PokemonResponse
import com.pedro.hernandez.poketinder202302.databinding.ActivityMainBinding
import com.pedro.hernandez.poketinder202302.ui.viewmodel.MainViewModel


class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navView: BottomNavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)
    }
}
