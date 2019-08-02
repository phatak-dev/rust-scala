package com.madhukaraphatak.scala.simple

object TraitExample {
  trait Display {
    def display()
  }

  class StringDisplay extends Display {
    def display() = println("string display")
  }

  class IntDisplay extends Display {
     def display() = println("int display")
  }

  def display(d :Display) = d.display()

  def main(args: Array[String]) = {
    val stringDisplay = new StringDisplay()
    display(stringDisplay)

    val intDisplay = new IntDisplay()
    display(intDisplay)
 }
}
