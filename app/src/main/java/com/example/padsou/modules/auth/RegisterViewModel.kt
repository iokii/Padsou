package com.example.padsou.modules.auth

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RegisterViewModel: ViewModel() {
    private val _email = MutableStateFlow("")
    val email = _email.asStateFlow()

    fun onEmailChange(email: String){
        viewModelScope.launch {
            _email.emit(email)
        }
    }

    private val _password = MutableStateFlow("")
    val password = _password.asStateFlow()

    fun onPasswordChange(password: String){
        viewModelScope.launch {
            _password.emit(password)
        }
    }

    private val _secondPassword = MutableStateFlow("")
    val secondPassword = _secondPassword.asStateFlow()

    fun onSecondPasswordChange(secondPassword: String){
        viewModelScope.launch {
            _secondPassword.emit(secondPassword)
        }
    }
}