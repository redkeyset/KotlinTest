package com.redkey.mvpregister.presenter.view

import com.redkey.mvpregister.base.presenter.view.BaseView

interface RegisterView : BaseView {
    fun onRegisterResult(result: Boolean, date: String)
}