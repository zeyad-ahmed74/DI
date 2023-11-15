package com.zeyad.di.car

import com.zeyad.di.AppComponent2
import com.zeyad.di.MainActivity2
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Named
import javax.inject.Singleton

@CustomScope
//@Component(/*modules = [WheelModule::class]*/ dependencies = [AppComponent2::class])
@Subcomponent
interface CarComponent {

    fun getCar():Car
    fun inject(mainActivity2: MainActivity2)

    @Subcomponent.Builder
    interface Builder{

        // Mandatory
        fun build():CarComponent

        @BindsInstance
        fun setWheelType(@WheelType wheelType:String):Builder

        @BindsInstance
        fun setEnginePower(@EnginePower enginePower:String):Builder

        @BindsInstance
        fun setBatteryVoltage(@VoltNum voltOfBattery:Int):Builder

        // This method will be used in Dependencies way only.

       // fun getAppComponent(appComponent2: AppComponent2):Builder

    }
}