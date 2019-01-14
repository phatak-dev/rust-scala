package com.madhukaraphatak.scala.simple

object TypeInference {

  def add(a : Int, b: Int) = {
    a +b 
  }

  def main(args: Array[String]) = {
    //normal type inference
    val a = 10;
    assert(a.isInstanceOf[Int], "not a int")
    // collection type inference 
    val values = List(10,20,30,40)
    assert(values.isInstanceOf[List[Int]], " not a list of int")

    println("add two numbers " +  add(10,20))
  }

}
