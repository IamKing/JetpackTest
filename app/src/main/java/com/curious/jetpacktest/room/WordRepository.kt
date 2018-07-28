package com.curious.jetpacktest.room

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.LiveData

class WordRepository(val application: Application) {
    private val wordDao: WordDao
    var allWords: LiveData<List<Word>>
        private set

    init {
        val db = AppRoomDatabase.getDatabase(application)!!
        wordDao = db.wordDao()
        allWords = wordDao.getAllWords()
    }

    fun insert(word: Word) {
        InsertAsyncTask(wordDao).execute(word)
    }

    fun update(word: Word) {
        wordDao.update(word)
    }

    fun delete(word:Word){
        wordDao.delete(word)
    }

    //other dao methods

    private class InsertAsyncTask : AsyncTask<Word, Void, Void> {
        val taskDao: WordDao

        constructor(dao: WordDao) {
            taskDao = dao
        }

        override fun doInBackground(vararg word: Word): Void? {
            taskDao.insert(word[0])
            return null
        }
    }

}