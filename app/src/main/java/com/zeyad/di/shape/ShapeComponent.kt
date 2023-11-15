package com.zeyad.di.shape

import dagger.Component


@Component(modules = [ShapeModule::class])
interface ShapeComponent {

    fun getShape() : Shape
}