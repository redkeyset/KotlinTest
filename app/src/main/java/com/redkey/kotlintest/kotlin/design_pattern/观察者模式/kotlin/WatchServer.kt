package com.redkey.kotlintest.kotlin.design_pattern.观察者模式.kotlin

/**
 * 定义被观察者，实现了Observerable接口，对Observerable接口的三个方法进行了具体实现，
 * 同时有一个List集合，用以保存注册的观察者，等需要通知观察者时，遍历该集合即可。
 */
class WatchServer internal constructor():Observerable{
    private val observers: MutableList<Observer>
    private var message: String = "默认消息样本"

    init {
        observers = ArrayList()
    }

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(message)
        }
    }

    internal fun setInfomation(message: String) {
        this.message = message
        println("服务端更新消息:$message")
        notifyObservers()
    }
}