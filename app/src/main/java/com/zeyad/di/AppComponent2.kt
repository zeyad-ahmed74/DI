package com.zeyad.di

import com.zeyad.di.car.Battery
import com.zeyad.di.car.CarComponent
import com.zeyad.di.car.Wheel
import com.zeyad.di.car.WheelModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [WheelModule::class])
interface AppComponent2 {

   // fun getWheel():Wheel
   // fun getBattery():Battery

    fun getCarComponent():CarComponent.Builder

}