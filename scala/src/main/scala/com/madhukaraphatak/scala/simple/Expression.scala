package com.madhukaraphatak.scala.simple

object Expression {

  def main(args: Array[String]) = {
   val a = 10
   val isEven = if(a % 2 == 0) true else false

   println(s"$a is even $isEven")

    val blockResultExpression =  {
      1+2;
    };

   println(s"the block expression result is $blockResultExpression")
  }

}
