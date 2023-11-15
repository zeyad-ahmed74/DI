package com.zeyad.di

import android.app.Application

class MainApplication : Application(){

   // private lateinit var coffeeComponent : CoffeeComponent
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

     //   coffeeComponent = DaggerCoffeeComponent.builder().setSugar(10).setMilk(1).build()

        appComponent = DaggerAppComponent.create()
    }

  //  fun getCoffeeComponent():CoffeeComponent = coffeeComponent

    fun getAppComponent():AppComponent = appComponent
}