package com.curious.jetpacktest.room

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.curious.jetpacktest.R
import kotlinx.android.synthetic.main.activity_room.*

class RoomActivity : AppCompatActivity() {

    var wordViewModel: WordViewModel? = null
    var index: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val adapter: WordListAdapter = WordListAdapter {
            Toast.makeText(this@RoomActivity, it.word, Toast.LENGTH_SHORT).show()
        }
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter


        wordViewModel = ViewModelProviders.of(this).get(WordViewModel::class.java)
        wordViewModel?.allwords?.observe({ lifecycle }) {
            adapter.words = it
        }

        floatActionBtn.setOnClickListener {
            //添加单词
            val word = Word()
            word.word = "word ${index++}"
            wordViewModel?.insert(word)
        }

    }


}