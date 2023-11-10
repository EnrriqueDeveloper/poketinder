package com.pedro.hernandez.poketinder202302.ui.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.pedro.hernandez.poketinder202302.ui.User
import com.pedro.hernandez.poketinder202302.util.SharedPreferenceUtil

class RegisterViewModel(private val context: Context) : ViewModel() {
    private lateinit var sharedPreferenceUtil: SharedPreferenceUtil

    fun onCreate() {
        sharedPreferenceUtil = SharedPreferenceUtil().also {
            it.setSharedPreference(context)
        }
    }

    fun saveUser(userId: String, userName: String, email: String, password: String) {
        val user = User(userId, userName, email, password)
        sharedPreferenceUtil.saveUser(user)
    }
}
