package com.gsm.additionutility

import android.content.Context
import android.content.Intent

object AdditionUtility {
    fun launchAdditionActivity(context: Context) {
        val intent = Intent(context, AdditionActivity::class.java)
        context.startActivity(intent)
    }

    fun getAdditionIntent(context: Context): Intent {
        return Intent(context, AdditionActivity::class.java)
    }
}
