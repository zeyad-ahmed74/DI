package com.zeyad.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zeyad.di.R
import com.zeyad.di.car.Car
import com.zeyad.di.car.WheelModule
import javax.inject.Inject
import javax.inject.Named

class MainActivity2 : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    @Inject
    lateinit var car2:Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

//        val carComponent = DaggerCarComponent.create()
//        carComponent.getCar().getCarComponent()

        // we use dagger in run time

       // val carComponent = DaggerCarComponent.builder().setWheelType("Sport plus").setEnginePower("3400 cc").setBatteryVoltage(300).build()
       // carComponent.getCar().getCarComponent()

      //  val carComponent = (application as MainApplication2).getCarComponent()
      //  carComponent.getCar().getCarGradients()

        val appComponent2 = (application as MainApplication2).getAppComponent2()

//        val carComponent = DaggerCarComponent.builder().getAppComponent(appComponent2).setEnginePower("2400 cc").setWheelType("Sport +").setBatteryVoltage(220).build()

        val carComponent = appComponent2.getCarComponent().setWheelType("Free 250").setEnginePower("4000 cc").setBatteryVoltage(330).build()
        carComponent.inject(this)


        Log.d("cccccc",""+
           "\n Car1 = "+car+
           "\n Car2 = "+car2+
           "\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+
           "\n Engine Of Car1 = "+car.engine+
           "\n Engine Of Car2 = "+car2.engine+
           "\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+
           "\n Volt Of Car1 = "+car.battery+
           "\n Volt Of Car2 = "+car2.battery+
           "\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+
           "\n WheelType Of Car1 = "+car.wheel+
           "\n WheelType Of Car2 = "+car2.wheel)

    }
}