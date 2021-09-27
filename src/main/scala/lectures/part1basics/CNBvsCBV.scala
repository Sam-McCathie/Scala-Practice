package lectures.part1basics

// Call by name vs call by value

object CNBvsCBV extends App{
  def calledByValue (x: Long): Unit = {
    println("By value: " + x) // By value: 6275954070382
    println("By value: " + x) // By value: 6275954070382
  }
  // Call by value will call based on the value that is initially used.
  // In this instance the nanotime will be the same for both println's

  def calledByName (x: => Long): Unit = {
    println("by name: " + x) // by name: 6276035163902
    println("by name: " + x) // by name: 6276036125009
  }
  // Call by name calls the function itself instead.
  // Therefore calling x separately two times.

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
}
