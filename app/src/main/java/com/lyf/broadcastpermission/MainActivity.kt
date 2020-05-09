package com.lyf.broadcastpermission

import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val PERMISSION_PRIVATE = "com.permission.lyf.receiver"
    private lateinit var receiver: MyReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentFilter = IntentFilter("Hi")
        receiver = MyReceiver()
//        registerReceiver(receiver, intentFilter)
        registerReceiver(receiver, intentFilter, PERMISSION_PRIVATE, null)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(receiver)
    }
}
