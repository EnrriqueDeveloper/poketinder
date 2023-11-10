package com.pedro.hernandez.poketinder202302.ui

import android.content.Intent
import android.os.Bundle
import com.pedro.hernandez.poketinder202302.util.SharedPreferenceUtil
import com.pedro.hernandez.poketinder202302.databinding.ActivityRegisterBinding
import com.pedro.hernandez.poketinder202302.ui.viewmodel.RegisterViewModel

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(ActivityRegisterBinding::inflate) {
    private lateinit var registerViewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerViewModel = RegisterViewModel(this)
        registerViewModel.onCreate()

        binding.btnRegister.setOnClickListener { view ->
            val userId = "1"
            val userName = binding.edtUserName.text.toString()
            val email = binding.edtEmail.text.toString()
            val password = binding.edtPassword.text.toString()

            registerViewModel.saveUser(userId, userName, email, password)

            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.btnGoLogin.setOnClickListener { view ->
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
