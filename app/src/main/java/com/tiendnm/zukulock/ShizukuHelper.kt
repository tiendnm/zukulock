package com.tiendnm.zukulock

import android.util.Log
import java.lang.reflect.Method
import rikka.shizuku.ShizukuRemoteProcess

object ShizukuHelper {

    fun useNewProcess(cmd: Array<String>, env: Array<String>?, dir: String?){
        val shizukuClass = Class.forName("rikka.shizuku.Shizuku")
        val newProcessMethod: Method = shizukuClass.getDeclaredMethod("newProcess", Array<String>::class.java, Array<String>::class.java, String::class.java)
        newProcessMethod.isAccessible = true
        val result = newProcessMethod.invoke(null, cmd, env, dir)
        if (result is ShizukuRemoteProcess) {
            // Handle the process here, you might want to manage streams or wait for completion
            // Example:
            // process.inputStream.bufferedReader().use { reader ->
            //     reader.forEachLine { line -> Log.d("ShizukuShell", line) }
            // }
            result.waitFor()
            result.destroy()
        } else {
            Log.e("ShizukuHelper", "Result is not an instance of ShizukuRemoteProcess")
            throw Exception()
        }
    }
}