package com.madhukaraphatak.scala.simple

object Typeclass {

  case class Person(name: String, age: Int)
  case class Restaraunt(name: String, brunch: Boolean)
  case class Recursive(name: String, r: Option[Recursive])

  trait Serializable[T] {
    def serialize(v: T): String

  }
  implicit object Person extends Serializable[Person] {

    def serialize(v: Person): String = "Person(" + v.name + "," + v.age + ")"
  }
  implicit object Restaraunt extends Serializable[Restaraunt] {

    def serialize(v: Restaraunt): String = "Restaraunt(" + v.name + "," + v.brunch + ")"
  }

  implicit def ListSerializable[T: Serializable] = new Serializable[List[T]] {
    def serialize(v: List[T]) = v.map(serializeMethod(_)).mkString("List(", ",", ")")
  }

  implicit def Tuple2Serializable[T: Serializable, V: Serializable] = new Serializable[(T, V)] {
    def serialize(v: (T, V)) = "(" + serializeMethod(v._1) + "," + serializeMethod(v._2) + ")"
  }

  implicit def IntSerializable = new Serializable[Int] {
    def serialize(v: Int) = v + ""
  }

  implicit object Recursive extends Serializable[Recursive] {

    def serialize(v: Recursive): String = v.r match {
      case None    ⇒ "Recursive(" + v.name + ")"
      case Some(r) ⇒ "Recursive(" + v.name + "," + serialize(r) + ")"
    }
  }

  def serializeMethod[T](value: T)(implicit serializer: Serializable[T]) = {
    serializer.serialize(value)
  }

  def main(args: Array[String]) = {
    val person = Person("test something", 10)
    val restarutant = Restaraunt("test", false)
    println(serializeMethod(person))
    println(serializeMethod(List(person, person)))
    println(serializeMethod((person, restarutant)))

    val recursive = Recursive("test", Some(Recursive("jack", None)))
  }

}
