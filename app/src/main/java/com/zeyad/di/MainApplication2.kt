package com.zeyad.di

import android.app.Application
import com.zeyad.di.car.CarComponent

class MainApplication2 : Application(){

    //private lateinit var carComponent : CarComponent

    private lateinit var appComponent2: AppComponent2

    override fun onCreate() {
        super.onCreate()

    // carComponent = DaggerCarComponent.builder().setWheelType("Sport plus").setEnginePower("3400 cc").setBatteryVoltage(300).build()

        appComponent2 = DaggerAppComponent2.create()
    }

  //  fun getCarComponent():CarComponent = carComponent

    fun getAppComponent2():AppComponent2 = appComponent2

}