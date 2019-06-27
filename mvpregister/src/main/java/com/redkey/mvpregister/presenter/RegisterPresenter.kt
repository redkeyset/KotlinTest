package com.redkey.mvpregister.presenter

import com.redkey.mvpregister.base.presenter.BasePresenter
import com.redkey.mvpregister.presenter.view.RegisterView

class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifyCode: String) {
        /**
         * 注册业务逻辑
         */

        mView.onRegisterResult(true, "mobile:$mobile ; verifyCode:$verifyCode")
    }
}