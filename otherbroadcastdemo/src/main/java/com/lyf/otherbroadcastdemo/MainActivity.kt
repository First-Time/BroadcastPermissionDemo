package com.lyf.otherbroadcastdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val PERMISSION_PRIVATE = "com.permission.lyf.receiver"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_send_broadcast.setOnClickListener {
            sendBroadcast(Intent("Hi"), PERMISSION_PRIVATE)
        }
    }
}
