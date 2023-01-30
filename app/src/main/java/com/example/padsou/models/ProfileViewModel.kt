package com.example.padsou.models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProfileViewModel: ViewModel() {
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
}