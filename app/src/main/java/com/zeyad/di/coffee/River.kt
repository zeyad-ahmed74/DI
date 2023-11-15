package com.zeyad.di.coffee

import android.util.Log
import javax.inject.Inject


class River /*@Inject constructor()*/{

    // we consider this class for view only


    private val TAG = "ssssss"
    init {
        Log.d(TAG,"River:")
    }

    fun getWater():String{
        return "Water...."
    }
}