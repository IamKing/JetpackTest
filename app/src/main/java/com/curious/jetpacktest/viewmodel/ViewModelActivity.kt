package com.curious.jetpacktest.viewmodel

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.curious.jetpacktest.R
import kotlinx.android.synthetic.main.activity_viewmodel.*

class ViewModelActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)

        //of(activity/fragment) of是表示此ViewModel的作用范围和生命周期时间，例如多个fragment共享数据，可以设置activity，让数据伴随activity生命周期
        val myViewModel: MyViewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)

        myViewModel.students?.observe({ lifecycle }) {
            Log.i(MyViewModel::javaClass.name, "==observer changed===")
            nameTV.text = "${it.name}, ${it.age}"
        }

        myViewModel.students?.value = Student("xiaoming", 19)
        //then try to rotate the phone screen and see the change
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        super.onConfigurationChanged(newConfig)
    }
}