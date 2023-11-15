package com.zeyad.di.shape

import javax.inject.Inject

class Shape @Inject constructor(

    private val circle: Circle,
    private val rectangle: Rectangle,
    private val square: Square

){

//    private val circle : Circle
//    private val rectangle : Rectangle
//    private val square : Square

//    init {
//        circle = Circle()
//        rectangle = Rectangle()
//        square = Square()
//    }



    fun draw(){
        println("Draw now....")
    }
}