package com.wkg.bikenfc

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class NFCHandlerActivity : AppCompatActivity() {

    private val TAG = NFCHandlerActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val data = intent.data
        data?.run {
            val pkg = getQueryParameter("pkg")
            val act = getQueryParameter("act")
            Log.d(TAG, "onCreate: package:$pkg,act:$act")
            if (!pkg.isNullOrEmpty() && !act.isNullOrEmpty()) {
                val helloBike = Intent().apply {
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    action = "android.intent.action.VIEW"
                    setClassName(pkg, act)
                }
                startActivity(helloBike)
            }
        }

        finish()
    }
}