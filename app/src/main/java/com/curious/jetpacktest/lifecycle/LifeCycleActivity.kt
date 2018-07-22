package com.curious.jetpacktest.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.curious.jetpacktest.R
import com.curious.jetpacktest.databinding.ActivityLifecycleBinding

class LifeCycleActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityLifecycleBinding>(this, R.layout.activity_lifecycle)
        val observer = MyObserver(lifecycle)
        lifecycle.addObserver(observer)
        observer.enable()
    }

    override fun onStart() {
        super.onStart()
        println("===onStart")
    }

    override fun onStop() {
        super.onStop()
        println("===onStop")
    }

    override fun onPause() {
        super.onPause()
        println("===onPause")
    }

    override fun onResume() {
        super.onResume()
        println("===onResume")
    }
}