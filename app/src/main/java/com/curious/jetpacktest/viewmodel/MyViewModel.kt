package com.curious.jetpacktest.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var students: MutableLiveData<Student>? = null
        private set
        get() {
            if (field == null) {
                field = MutableLiveData()
            }
            loadUsers()
            return field
        }


    fun loadUsers() {
        println("load users====")
    }
}