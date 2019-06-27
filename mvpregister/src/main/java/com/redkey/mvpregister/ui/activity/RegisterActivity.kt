package com.redkey.mvpregister.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.redkey.mvpregister.base.ui.activity.BaseMvpActivity
import com.redkey.mvpregister.presenter.RegisterPresenter
import com.redkey.mvpregister.presenter.view.RegisterView
import com.redkey.usercenter.R
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {
    override fun onRegisterResult(result: Boolean, date: String) {
        toast("MVP注册成功！\n $date")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        init()

        initEvent()
    }

    private fun init() {
        mPresenter = RegisterPresenter()
        mPresenter.mView = this
    }

    private fun initEvent() {
        mRegisterBtn.setOnClickListener {
            mPresenter.register(et_phone_num.text.toString(), et_password.text.toString())
        }
    }
}
