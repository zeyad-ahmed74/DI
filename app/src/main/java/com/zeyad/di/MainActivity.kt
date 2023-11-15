package com.zeyad.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.zeyad.di.MainApplication
import com.zeyad.di.R
import com.zeyad.di.coffee.Coffee
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var coffee: Coffee
    @Inject
    lateinit var coffee2: Coffee

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val circle = Circle()
//        val rectangle = Rectangle()
//        val square = Square()
//
//        val shape = Shape(circle, rectangle, square)  // Dependency Injection
//        shape.draw()

//        val shapeComponent = DaggerShapeComponent.create()
//        shapeComponent.getShape().draw()


        //  val coffeeComponent = DaggerCoffeeComponent.create() // error as module take parameters in its constructor


        // val coffeeComponent = DaggerCoffeeComponent.builder().coffeeModule(CoffeeModule(2)).build() // we pass no of sugar to module constructor

        //   val coffeeComponent = DaggerCoffeeComponent.builder().setSugar(10).setMilk(1).build()    // we create our builder interface to reduce the boilerplate code


       // val coffeeComponent = (application as MainApplication).getCoffeeComponent()  // we caste here the application to MainApplication that we create it to get method ( getCoffeeComponent() )
        //coffeeComponent.getCoffee().getCoffeeCup()


//        val coffeeComponent = DaggerCoffeeComponent.builder().setSugar(3).setMilk(2).build()
//        coffeeComponent.inject(this)


        //coffee.connectElectricity() // Dummy code as dagger will perform the injected method without need to call it

        // we check here the instance of the farm in coffee 1 is different from instance of the farm from coffee 2 or Not.

       // Log.d("qqqqq",""+coffee.getCoffeeCup() +"\n farm for coffee1 : " +coffee.farm + "\n farm for coffee2 : "+coffee2.farm)

      // Log.d("ddddd",""+coffee.getCoffeeCup() +"\n River for coffee1 : " +coffee.river + "\n River for coffee2 : "+coffee2.river)

//        Log.d("xxxxxx", ""+
//                    "\n Coffee 1 : " + coffee +
//                    "\n Coffee 2 : " + coffee2 +
//                    "\n River for coffee1 : " + coffee.river +
//                    "\n River for coffee2 : " +coffee2.river )

        val appComponent = (application as MainApplication).getAppComponent()
       // appComponent.getRiver().getWater()


          // the Dependencies way

//        val coffeeComponent = DaggerCoffeeComponent.builder().setSugar(3).appComponent(appComponent).setMilk(2).build()
//        coffeeComponent.inject(this)

        // the SubComponent Way

        val coffeeComponent = appComponent.getCoffeeComponentBuilder().setSugar(3).setMilk(2).build()
        coffeeComponent.inject(this)


        Log.d("xxxxxx", ""+
                    "\n Coffee 1 : " + coffee +
                    "\n Coffee 2 : " + coffee2 +
                    "\n River for coffee1 : " + coffee.river +
                    "\n River for coffee2 : " +coffee2.river +
                    "\n Farm for coffee1 : " + coffee.farm +
                    "\n Farm for coffee2 : " +coffee2.farm)


    }
}