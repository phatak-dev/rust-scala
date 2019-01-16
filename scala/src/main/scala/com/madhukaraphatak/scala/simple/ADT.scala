package com.madhukaraphatak.scala.simple
sealed trait Optional[+T]

case object CNone extends Optional[Nothing]

case class CSome[T](value:T) extends Optional[T]

object ADT {

  def main(args:Array[String]) {
     val intOptionalNone:Optional[Int] = CNone
     val intOptionalSome:Optional[Int] = CSome(10)

     intOptionalSome match {
     case CSome(value) => println("value is {}", value)
     case CNone => println("none value")
   }
}
}
