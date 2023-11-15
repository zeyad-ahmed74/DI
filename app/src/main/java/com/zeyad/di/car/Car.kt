package com.zeyad.di.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

class Car @Inject constructor(
     val engine: Engine,
     val wheel: Wheel,
    @WheelType private val wheelType : String,
    @EnginePower private val enginePower : String,
    @VoltNum private val voltOfBattery : Int

){

    @Inject
    lateinit var battery: Battery

    fun getCarGradients(){
        Log.d("carComponent",""+
                "\n Car Engine : "+ enginePower +
                "\n Car Wheels is : "+ wheelType +
                "\n Car battery is : " +voltOfBattery)
    }





}