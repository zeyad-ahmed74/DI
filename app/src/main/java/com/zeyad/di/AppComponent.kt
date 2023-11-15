package com.zeyad.di

import com.zeyad.di.coffee.CoffeeComponent
import com.zeyad.di.coffee.RiverModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [RiverModule::class])
interface AppComponent {

    //fun getRiver(): River
    //fun getFarm(): Farm

    fun getCoffeeComponentBuilder(): CoffeeComponent.Builder

}