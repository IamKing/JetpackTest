package com.curious.jetpacktest.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.curious.jetpacktest.R

class DataBindingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityDataBindingBinding>(this, R.layout.activity_data_binding);
        val user = User("Zhang", "9927", 18)
        binding.user = user


    }
}