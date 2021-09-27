package lectures.part1basics

object Expressions extends App{
  val x = 1 + 2 //Expression
  println(x)

  println(2 + 3 * 4) //math operators
  // + - * / | ^ << >> >>>

  println(x == 4) //returns false - evaluates to boolean
  // == != > >= < <=

  println(!(x == 4)) //returns true
  // ! && ||

  var aVariable = 2
  aVariable += 6 // 2 + 6 = 8
  println(aVariable) // returns 8
  //  -= *= /= ..... side effects

 // Instructions (DO) vs Expressions (VALUE)
 // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // meaning if aCondition is true then return 5 else return 3
    println(aConditionedValue) //returns 5

  var i = 0
  while (i < 5){
    println(i)
    i += 1
  }
// NEVER WRITE THIS AGAIN :O

// Everything in Scala is an expression.
  val aWeirdValue = (aVariable = 3) //Unit === void -> does not return anything meaningful.
  println(aWeirdValue) // = ()

// side effects: println(), whiles, reassigning

//Code blocks = expression
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
}
// the value of the whole codeblock is the value of the final expression because it occurs last.
// vals inside the codeblock are only Accessable within the codeblock.

// 1. Difference between "hello world" vs println("hello "world)? -> "hello world" is a string literal & println("hello world") expression side effect
// 2.
    val someValue = {
  2 < 3
}
// = true?

// 3.
    val someOtherValue = {
      if(someValue) 239 else 986
    }
// = 42

}
