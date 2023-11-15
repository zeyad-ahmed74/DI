package com.zeyad.di.car

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Battery @Inject constructor() {

    fun getBattery():String{
        return "German Battery 220 volt"
    }
}