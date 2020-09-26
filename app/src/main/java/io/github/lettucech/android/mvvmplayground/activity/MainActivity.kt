package io.github.lettucech.android.mvvmplayground.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.lettucech.android.mvvmplayground.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}