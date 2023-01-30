package com.example.padsou.models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PageAddViewModel: ViewModel() {
    private val _label = MutableStateFlow("")
    val label = _label.asStateFlow()

    fun onLabelChange(label: String){
        viewModelScope.launch {
            _label.emit(label)
        }
    }

    private val _souslabel = MutableStateFlow("")
    val souslabel = _souslabel.asStateFlow()

    fun onSousLabelChange(souslabel: String){
        viewModelScope.launch {
            _souslabel.emit(souslabel)
        }
    }

    private val _link = MutableStateFlow("")
    val link = _link.asStateFlow()

    fun onLinkChange(link: String){
        viewModelScope.launch {
            _link.emit(link)
        }
    }

}