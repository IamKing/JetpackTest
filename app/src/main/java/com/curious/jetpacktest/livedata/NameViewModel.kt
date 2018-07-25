package com.curious.jetpacktest.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NameViewModel : ViewModel() {

    var mCurrentName: MutableLiveData<String>? = null;

    fun getCurrentName(): MutableLiveData<String>? {
        if (mCurrentName == null) mCurrentName = MutableLiveData();
        return mCurrentName
    }


    override fun onCleared() {
        super.onCleared()
    }
}