package com.redkey.kotlintest.android.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.redkey.kotlintest.R
import org.jetbrains.anko.toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initData()
    }

    private fun initData() {
        toast(
            "id:${intent.getIntExtra("id", -1)} \npd:${intent.getBooleanExtra("pd", false)} \n" +
                    "kd:${intent.getStringExtra("kd")}"
        )
    }
}
