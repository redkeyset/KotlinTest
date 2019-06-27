package com.redkey.mvpregister.base.ui.activity

import com.redkey.mvpregister.base.presenter.BasePresenter
import com.redkey.mvpregister.base.presenter.view.BaseView

open class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {
    lateinit var mPresenter: T

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun onError() {

    }
}