package lectures.part1basics

object Functions extends App{
  def aFucntion (a: String, b: Int): String = {
    a + " " + b
  }
  // def is the same as typing 'function'
  println(aFucntion("hello", 5)) // call a function similar to js

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction()) //can be called like this

  //The Int below defines how many times it will run.
  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
// When you need loops -> use recursion
  println(aRepeatedFunction("Heya", 4))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  //You can call functions inside of functions with information from the bigger function
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction (a: Int, b: Int): Int  = a + b
    aSmallerFunction(n, n-1)
  }

  //Questions a greeting function
  // 1. Take a name and an age and output as a string.
  def nameString(name: String, age: Int): String = "Hello my name is " + name + " and I am " + age + " years old"
  println(nameString("Sam", 25))

  // 2. Factorial function.
  def factorial(n: Int):Int = {
    if (n <= 0 ) 1
    else n * factorial(n-1)
  }
  println(factorial(3)) // = 3 * 2 * 1

  def fibonachi(n: Int): Int = {
    if (n <= 2) 1
    else fibonachi(n - 1) + fibonachi(n - 2)
  }
 println(fibonachi(8)) // 1 1 2 3 5 8 13 21

  //Check understanding of recursive
  def buttCount(n: Int): String = {
    if (n == 1) "Butt"
    else "Butt" + buttCount(n-1)
  }

  println(buttCount(5))
}



