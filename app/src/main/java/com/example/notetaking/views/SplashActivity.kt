package com.example.notetaking.views

import android.os.Bundle
import com.example.notetaking.R
import com.example.notetaking.views.base.BaseActivity

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}