package com.redkey.mvpregister.base.presenter

import com.redkey.mvpregister.base.presenter.view.BaseView

open class BasePresenter<T : BaseView> {
    lateinit var mView: T
}