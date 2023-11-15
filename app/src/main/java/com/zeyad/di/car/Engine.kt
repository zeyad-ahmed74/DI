package com.zeyad.di.car

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Engine @Inject constructor() {

    fun getEngine():String{
        return "Electrical Engine 2600 cc"
    }
}