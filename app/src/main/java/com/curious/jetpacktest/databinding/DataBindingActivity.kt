package com.curious.jetpacktest.databinding

import android.os.Bundle
import android.os.Handler
import android.os.Message
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.curious.jetpacktest.R

class DataBindingActivity : AppCompatActivity() {


    var user: User? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityDataBindingBinding>(this, R.layout.activity_data_binding);
        user = User("Zhang", "9927", 18)
        binding.user = user

        val handler = Handler(object : Handler.Callback {
            override fun handleMessage(p0: Message?): Boolean {
                user?.firstname = "xiao"
                user?.lastname = "ming"
                user?.age = 10
                return true
            }
        })
        handler.sendMessageDelayed(handler.obtainMessage(0), 5000)

    }
}