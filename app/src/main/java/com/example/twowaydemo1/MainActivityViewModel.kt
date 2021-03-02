package com.example.twowaydemo1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private val userNameData = MutableLiveData<String>()
    val userName: LiveData<String>
        get() = userNameData

    init {
        userNameData.value = "Muzafferus"
    }

}