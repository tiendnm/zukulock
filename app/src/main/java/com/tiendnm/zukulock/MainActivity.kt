package com.tiendnm.zukulock

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val serviceIntent = Intent(this, SleepService::class.java)
        startService(serviceIntent)
        finish()
    }
}