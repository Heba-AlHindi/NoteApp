package com.example.notetaking.views.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notetaking.R

open class BaseActivity : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}