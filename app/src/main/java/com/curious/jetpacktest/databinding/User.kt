package com.curious.jetpacktest.databinding

import androidx.databinding.BaseObservable

/**
 * BaseObservable 表示可被观察的对象
 */
class User(firstname: String, lastname: String, age: Int) : BaseObservable() {
    var firstname: String = firstname
        set(value) {
            field = value
            notifyChange()
        }
    var lastname: String = lastname
        set(value) {
            field = value
            notifyChange()
        }
    var age: Int = age
        set(value) {
            field = value
            notifyChange()
        }

}