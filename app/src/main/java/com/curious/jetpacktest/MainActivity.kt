package com.curious.jetpacktest

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.curious.jetpacktest.databinding.DataBindingActivity
import com.curious.jetpacktest.lifecycle.LifeCycleActivity
import com.curious.jetpacktest.livedata.LiveDataActivity
import com.curious.jetpacktest.room.RoomActivity
import com.curious.jetpacktest.viewmodel.ViewModelActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun doOnClick(view: View) {
        R.id.data_bind_btn
        when (view.id) {
            R.id.data_bind_btn -> startActivity(Intent(this@MainActivity, DataBindingActivity::class.java))
            R.id.lifecycle_btn -> startActivity(Intent(this@MainActivity, LifeCycleActivity::class.java))
            R.id.livedata_btn -> startActivity(Intent(this@MainActivity, LiveDataActivity::class.java))
            R.id.viewmodel_btn -> startActivity(Intent(this@MainActivity, ViewModelActivity::class.java))
            R.id.room_btn -> startActivity(Intent(this@MainActivity, RoomActivity::class.java))
        }
    }
}
