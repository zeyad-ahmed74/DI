package com.zeyad.di.coffee

import android.util.Log
import com.zeyad.di.ActivityScope
import javax.inject.Inject


@ActivityScope
class Coffee @Inject constructor(
    val farm: Farm,
    /* val river : River ,*/
    /* @Named("sugar")*/ @Sugar val sugar:Int,
    /* @Named("milk")*/  @Milk val milk:Int
){

    private  val tag = "ssssss"


    @Inject
    lateinit var  river: River

    fun drinkCoffee(){
        println("Drink Coffee....")
    }

    fun getCoffeeCup (){
        Log.d(tag ,farm.getBeans()+" + "+river.getWater() + "Sugar : "+sugar + " Milk: "+milk+" Tablespoons")
    }

    @Inject
    fun connectElectricity(){
        Log.d(tag ,"Electricity connected....")
    }
}