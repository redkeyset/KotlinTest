package com.redkey.kotlintest.android.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.redkey.kotlintest.R
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initEvent()
    }

    private fun initEvent() {
        mBtnStartActivity.setOnClickListener {
            startActivity(intentFor<Main2Activity>("id" to 5, "pd" to true, "kd" to "KDKD"))
            //或者
//            startActivity<Main2Activity>("id" to 5, "pd" to true, "kd" to "KDKD")
        }
    }
}
