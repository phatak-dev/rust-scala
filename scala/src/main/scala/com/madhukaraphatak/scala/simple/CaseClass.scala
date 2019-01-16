package com.madhukaraphatak.scala.simple

object CaseClass {

  case class Person(name: String = "Anonymous", age: Int = 30)

  def main(args: Array[String]) = {
    val firstPerson = Person("jack", 20)

    val secondPerson = Person("john", 30)

    val secondJack = Person("jack", 20)

    println(s"compare first and second person, result is ${firstPerson == secondPerson}")
    println(s"compare same person, result is ${firstPerson == secondJack}")

    // create clone with different values
    val thirdPerson = firstPerson.copy()

    // default params
    val defaultPerson: Person = Person()
    println("default values are " + defaultPerson)
  }

}
