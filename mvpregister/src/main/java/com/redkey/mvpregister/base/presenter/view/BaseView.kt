package com.redkey.mvpregister.base.presenter.view

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError()
}