package com.wkg.bikenfc

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class HelloBikeActivity : AppCompatActivity() {

    private val TAG = HelloBikeActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val data = intent.data
        data?.run {
            val helloBike = Intent().apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
                action = "android.intent.action.VIEW"
                setClassName("com.jingyao.easybike", "com.hellobike.evehicle.business.main.EVehicleHomeManagerActivity")
            }
            startActivity(helloBike)
        }
        finish()
    }
}