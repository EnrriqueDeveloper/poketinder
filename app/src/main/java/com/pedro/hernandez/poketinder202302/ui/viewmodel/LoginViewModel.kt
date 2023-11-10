package com.pedro.hernandez.poketinder202302.ui.viewmodel

import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pedro.hernandez.poketinder202302.ui.User
import com.pedro.hernandez.poketinder202302.util.SharedPreferenceUtil

class LoginViewModel (private val context: Context): ViewModel() {
    private lateinit var sharedPreferenceUtil: SharedPreferenceUtil

    val emptyFieldsError = MutableLiveData<Boolean>()
    val fieldsAuthenticateError = MutableLiveData<Boolean>()
    val goSuccessActivity = MutableLiveData<Boolean>()

    fun onCreate(){
        sharedPreferenceUtil = SharedPreferenceUtil().also{
            it.setSharedPreference(context)
        }
    }

    fun validateInputs(email: String, password: String){
        if(email.isEmpty() && password.isEmpty()){
            emptyFieldsError.postValue(true)
        }

        val user: User? = sharedPreferenceUtil.getUser()

        if(email ==user?.email && password == user?.password){
            goSuccessActivity.postValue(true)
        }else{
            fieldsAuthenticateError.postValue(true)
        }

    }
}