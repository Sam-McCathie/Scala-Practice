package lectures.part2oop

//Lesson 10 - Object-Oriented Basics

object OOBasics extends App{
  val person = new Person("Sam", 25)
  println(person)
  person.greet("Acacia")
  person.greet()
}

//organises data and behavior that is code.
// constructor (below) -> meaning ever instance of person must be constructed with a name and an age.
class Person(name: String, age: Int = 0) {
  val x = 2
  println(1 + 3)

  //Method
  def greet (name: String): Unit = println(s"$name says hello to ${this.name}") // Acacia says hello to Sam

  // Overloading - defining the same name but with different signatures.(different numbers of parameters or params with different types)
  def greet(): Unit = println(s"Hi, I am $name") // Hi, I am Sam
  // name is implied when no other value is given. Same result as this.name

  // Multiple constructors
  def this(name: String) = this(name, 0)
}
// class parameters are NOT fields. They can be fields if you add val infront of them. e.g. (val age: Int) ~ val or var

/* 11. Object-Oriented Basics
     Novel and a writer
     Writer: first name, surname, year
        - method full name

     Novel: name, year of release, author
        - authorAge
        - isWrittenBy (author)
        - copy (new year of release) = new instance of Novel
*/
  object Questions extends App {
  val author = new Writer("Z", "Zu", 1990)
  val novel = new Novel("Great novel", 1995, author)
  println(novel.authorAge) // returns 5
  println(novel.isWrittenBy(author)) // returns true

}

  class Writer (firstName: String, surname: String, val year: Int) {
    def fullName: String = firstName + " " + surname
  }

  class Novel(name: String, year: Int, author: Writer){ //author is grabbing information from the Writer class.
    def authorAge = year - author.year // year can be accessed as it has been made a field by adding val as above.
    def isWrittenBy (author: Writer) = author == this.author
    def copy(newYear: Int): Novel = new Novel (name, newYear, author)
  }
/*
   Counter Class
    - receives an int value
    - method current count
    - method to increment/ decrement => new Counter
    - overload inc/ dec to receive an amount
*/

object QuestionsPt2 extends App {
  val counter = new Counter // default value is implied to be 0 -> else would have had to add (0)
  counter.inc.print // increments 1 x then prints value.
  counter.inc.inc.inc.print // increments 3 x then prints value.
  counter.inc(10).print // increments 10 x then prints value.
}

class Counter(val count: Int = 0){ //(val count: Int) = def count = n
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  } // immutability -> returning a new counter instead of modifying count in this instance.
  // Instances are fixed and cannot be modified inside.
  // when ever modifying an instance, you need to return a new instance.

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = { //Counter = the result type.
    if (n <= 0) this // returns starting instance because nothing needs to occur.
    else inc.inc(n - 1)

  }
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)
  }
  def print = println(count)
}