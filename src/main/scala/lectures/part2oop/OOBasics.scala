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

object NovelWriter extends App{
  val author = new Author ("Sam", "McCathie", 1995)
  author.fullName()

  val novel = new Novel ("Book 1", "Jan 1st 1990", "Mr Potato")
  novel.authorAge(95)
  novel.isWrittenBy("Seeek book")
  novel.isWrittenBy("Seeeeker 2", "Big Cheese")
}

class Author (fName: String, lName: String, year: Int){
  def fullName (): Unit = println(s"Author - $fName $lName, Born - $year")

}
class Novel (title: String, release: String, author: String){
  def authorAge(age: Int): Unit = println(s"The author $author is $age years old")
  def isWrittenBy(book: String): Unit = println(s"The book $book is written by $author.")
  def isWrittenBy(book: String, author: String): Unit = println(s"New book $book written by $author" +
                                                  s" -> original ${this.title} was written by ${this.author}")
}

/*
   Counter Class
    - receives an int value
    - method current count
    - method to increment/ decrement => new Counter
    - overload inc/ dec to receive an amount
*/
object Calculator extends App {
  val counter = new Counter(20)
  counter.count()
  counter.add(25)
}

class Counter (start: Int) {
  def count(): Unit = println(s"The count is $start")
  def add(x: Int) = println(s"Count + Input = ${start + x}")
}