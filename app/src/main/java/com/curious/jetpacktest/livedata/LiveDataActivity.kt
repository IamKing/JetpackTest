package com.curious.jetpacktest.livedata

import android.os.Bundle
import android.os.Handler
import android.os.Message
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.curious.jetpacktest.R
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {


    var nameViewModel: NameViewModel? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)
        name_tv.text = "5秒后数据会发生变化"

        nameViewModel = ViewModelProviders.of(this).get(NameViewModel::class.java)
        val observer: Observer<String> = object : Observer<String> {
            override fun onChanged(t: String?) {
                name_tv.text = t
            }
        }
        nameViewModel?.getCurrentName()?.observe(this, observer)

        val handler = Handler(object : Handler.Callback {
            override fun handleMessage(p0: Message?): Boolean {
                nameViewModel?.getCurrentName()?.value = "5秒时间到00000"
                return true
            }
        })
        handler.sendMessageDelayed(handler.obtainMessage(0), 5000)
    }
}