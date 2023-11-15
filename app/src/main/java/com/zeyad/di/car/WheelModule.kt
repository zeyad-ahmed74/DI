package com.zeyad.di.car

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton


@Module
class WheelModule constructor(
   // private val wheelType : String,
   // private val enginePower : String,
   // private val voltOfBattery : Int
){

    @Singleton
    @Provides
    fun provideWheel():Wheel = Wheel()
//
//    @Provides
//    @Named("wheelType")
//    fun provideWheelType():String = wheelType
//
//    @Provides
//    @Named("enginePower")
//    fun provideEnginePower():String = enginePower
//
//    @Provides
//    @Named("voltNo")
//    fun provideBatteryVoltage():Int = voltOfBattery

}