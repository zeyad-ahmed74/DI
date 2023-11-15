package com.zeyad.di.coffee

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Farm @Inject constructor() {

    private val TAG = "sssss"

    init {
        Log.d(TAG,"Farm:")

    }
    fun getBeans():String {
        return "Brazilian Beans Of Coffee"
    }
}