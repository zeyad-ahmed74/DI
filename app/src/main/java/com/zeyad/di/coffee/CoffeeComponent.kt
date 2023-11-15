package com.zeyad.di.coffee

import com.zeyad.di.ActivityScope
import com.zeyad.di.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
//@Component(/*modules = [RiverModule::class]*/ dependencies = [AppComponent::class])
@Subcomponent
interface CoffeeComponent  {

    fun getCoffee() : Coffee
    fun inject(mainActivity: MainActivity)

    //@Component.Builder
    @Subcomponent.Builder
    interface Builder{

        @BindsInstance
        fun setSugar(/*@Named("sugar")*/ @Sugar sugar:Int): Builder
        @BindsInstance
        fun setMilk(/*@Named("milk")*/  @Milk milk:Int): Builder

     //   fun appComponent(appComponent: AppComponent) : Builder

        fun build(): CoffeeComponent
    }

}