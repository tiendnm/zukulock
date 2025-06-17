package com.tiendnm.zukulock

import android.app.Service
import android.content.Intent
import android.content.pm.PackageManager
import android.os.IBinder
import android.util.Log
import android.widget.Toast
import rikka.shizuku.Shizuku

class SleepService : Service() {

    private val REQUEST_CODE: Int = 0

    private fun checkPermission(code: Int): Boolean {
        if (!Shizuku.pingBinder()) {
            Toast.makeText(this, "Shizuku service is not running", Toast.LENGTH_LONG).show()
            return false
        }
        if (Shizuku.isPreV11()) {
            // Pre-v11 is unsupported
            return false
        }

        if (Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) {
            // Granted
            return true
        } else if (Shizuku.shouldShowRequestPermissionRationale()) {
            // Users choose "Deny and don't ask again"
            return false
        } else {
            // Request the permission
            Shizuku.requestPermission(code)
            return false
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val check = checkPermission(REQUEST_CODE)
        if (check) {
            runShellCommand()
        }
        stopSelf()

        return START_NOT_STICKY
    }

    private fun runShellCommand() {
        try {
            ShizukuHelper.useNewProcess(arrayOf("input", "keyevent", "26"), null, null)
        } catch (e: Exception) {
            Log.e("ShizukuShell", "Error running shell command", e)
        }
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}