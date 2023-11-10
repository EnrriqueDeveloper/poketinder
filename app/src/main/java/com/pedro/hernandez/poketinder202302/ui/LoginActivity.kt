package com.pedro.hernandez.poketinder202302.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.pedro.hernandez.poketinder202302.util.SharedPreferenceUtil
import com.pedro.hernandez.poketinder202302.databinding.ActivityLoginBinding
import com.pedro.hernandez.poketinder202302.ui.viewmodel.LoginViewModel


class LoginActivity: BaseActivity<ActivityLoginBinding>(ActivityLoginBinding :: inflate) {
    private lateinit var loginViewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnLogin.setOnClickListener{
            startLogin()
        }
        loginViewModel = LoginViewModel(this)
        loginViewModel.onCreate()

        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        loginViewModel.emptyFieldsError.observe(this){
            Toast.makeText(this, "Ingrese los datos de Usuario", Toast.LENGTH_SHORT).show()
        }
        loginViewModel.fieldsAuthenticateError.observe(this){
            Toast.makeText(this, "Error Usuario", Toast.LENGTH_SHORT).show()
        }
        loginViewModel.goSuccessActivity.observe(this){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun startLogin() {
        loginViewModel.validateInputs(
            binding.edtEmail.text.toString(),
            binding.edtPassword.text.toString()
        )
    }
}