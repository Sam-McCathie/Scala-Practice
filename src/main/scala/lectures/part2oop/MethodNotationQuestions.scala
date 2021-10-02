package lectures.part2oop

object MethodNotationQuestions extends App{
  class Person (val name: String, faveMovie: String, val age: Int = 0) {
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", faveMovie) //Q1
    def unary_+ : Person = new Person (name, faveMovie, age + 1)
    def apply(): String = s"Hi, my name is $name and I like $faveMovie"
    def apply(n: Int): String = s"$name watched $faveMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
  }

//    1. Overload the + operator
//    Sam + operator -> receives a string.
  val sam = new Person ("Sam", "Shrek")
  val acacia = new Person ("Acacia", "Zuzu")

  println(sam + acacia) // Sam is hanging out with Acacia
  println(sam.apply()) // Hi, my name is Sam and I like Great movie
  println((sam + "is awesome").apply()) // Hi, my name is Sam (is awesome) and I like Great movie
  // + redefines the Person class with new parameters
  // Then knows it is called because of the string that is being passed?

  //2.  Add an age to the Person class
  //    Add a unary + operator => new person with the age + 1
  //    +sam => same with the age incrementer

  println((+sam).age)
  // calls unary_+ method -> creates a new person using the Sam vals
  // -> then calls the age of this person = 1

  // 3. ??
  println(sam.learnsScala)

  // 4. Overload apply method to also return an int.
  println(sam.apply(5))

}
