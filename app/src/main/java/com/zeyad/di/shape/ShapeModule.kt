package com.zeyad.di.shape

import com.zeyad.di.shape.Circle
import dagger.Module
import dagger.Provides


@Module
class ShapeModule {

    @Provides
    fun provideCircle(): Circle = Circle()

}