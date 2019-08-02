package com.madhukaraphatak.scala.simple

object Extensions {

  implicit class IntExtensions(a: Int) {
    def add(b: Int) = {
      a + b
    }
  }

  def main(args: Array[String]) = {
    //normal type inference
    val a = 10;
    println(s"sum of values is ${a.add(10)}")
  }
}
