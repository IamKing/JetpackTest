package com.curious.jetpacktest.room

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.curious.jetpacktest.R
import kotlinx.android.synthetic.main.item_word.view.*

class WordListAdapter(val itemClick: (Word) -> Unit) : RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {

    var words: List<Word>? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_word, parent, false)
        return WordViewHolder(view, itemClick)
    }

    override fun getItemCount(): Int = words?.size ?: 0

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.bind(words?.get(position)!!)
    }

    class WordViewHolder(val view: View, val itemClick: (Word) -> Unit) : RecyclerView.ViewHolder(view) {
        fun bind(word: Word) {
            view.textView.text = word.word
            view.setOnClickListener { itemClick(word) }
        }
    }

}