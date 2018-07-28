package com.curious.jetpacktest.room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class WordViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: WordRepository = WordRepository(application)
    val allwords: LiveData<List<Word>>

    init {
        allwords = repository.allWords
    }

    fun insert(word: Word) {
        repository.insert(word)
    }

}