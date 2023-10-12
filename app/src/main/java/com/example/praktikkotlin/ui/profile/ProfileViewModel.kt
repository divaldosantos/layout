package com.example.praktikkotlin.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Fadias Nur Ahmadi"
    }
    val text: LiveData<String> = _text

}