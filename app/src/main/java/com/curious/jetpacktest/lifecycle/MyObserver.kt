package com.curious.jetpacktest.lifecycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver(val lifecycle: Lifecycle) : LifecycleObserver {

    //如果再回调中使用，最好是加上一个enable标志位
    private var enable: Boolean = false


    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun connectListener() {
        if (!enable) return
        println("===ON_RESUME==connectListener")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun disconnectListener() {
        if (!enable) return
        println("===ON_PAUSE==disconnectListener")
    }

    fun enable() {
        enable = true
        if (lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
            //connect is not connected
        }
    }
}