package com.zeyad.di.coffee

import com.zeyad.di.coffee.River
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RiverModule constructor(/*val sugar : Int*/){


//    @Provides
//    fun provideSugar():Int = sugar


    @Singleton   // annotation here to make an only one instance of river
    @Provides
    fun provideRiver(): River = River()

}