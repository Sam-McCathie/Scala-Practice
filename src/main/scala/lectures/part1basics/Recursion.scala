package lectures.part1basics

object Recursion extends App{
  //Call stacks need to be completed in order and can move on only after each call stack is complete.
  def factorial (n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I forst need factorial of " + (n - 1)) //call stack 1
      val result = n * factorial(n-1)
      println("Computed factorial of " + n) //call stack 2

      result // call stack 3
    }
//  println(factorial(10)) // = 3628800

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION
  def anotherFactorial (n: Int): Int = {
    def factHelper (x: Int, accumulator: Int): Int =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) //TAIL RECURSION = use recursive call as the LAST expression.

    factHelper(n,1)
  }
//  println(anotherFactorial(10)) // = 3628800
  /*anotherFactorial works like
  anotherFactorial(10) = factHelper(10,1)
  = factHelper(9, 10 * 1)
  = factHelper(8, 9 * 10 * 1)
  = factHelper(7, 8 * 9 * 10 * 1)
  = factHelper(6, 7 * .... * 10 * 1)
  = ....
  = factHelper(2, 3 * 4 * ...... * 9 * 10 * 1)
  * */

  //Create tail recursion loop.
  def concatTail(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatTail(aString, n-1, aString + accumulator)

//  println(concatTail("Butt",5,""))

  def addOne (n: Int): Int = {
    def addOneHelper(x: Int, accumulator: Int): Int = {
      if (x <= 0) accumulator
      else
        println(x)
        addOneHelper(x - 1, 5 + accumulator)
    }
    addOneHelper(n, 0)
  }
//  println(addOne(5))

  def chees (n: Int, aString: String, accumulator: String): String = {
      if (n <= 0) accumulator
      else chees( n - 1, aString, n + aString + accumulator)
  }
  println(chees(4, "chees", ""))
}

// n is how many times it will run
// aString is the string added
// accumulator is the variable that is storing the information after each loop.
