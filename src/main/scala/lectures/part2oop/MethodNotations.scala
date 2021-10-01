package lectures.part2oop

// 12. Syntactic Sugar: Method Notations
object MethodNotations extends App{
  class Person (val name: String, faveMovie: String){
    def likes(movie: String): Boolean = movie == faveMovie //method

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def unary_! : String = s"$name, what the heck?!"

    def isAlive: Boolean = true

    def apply():  String = s"Hi, my name is $name and I like $faveMovie"
  }

    val mary = new Person("Mary", "A great movie name")
    println(mary.likes("A great movie name"))
    println(mary likes "A great movie name") // = the same as above -> this is called infix notation or operator notation.
    // infix notation only works when there is one parameter
    // Above = syntactic sugar -> nicer ways of writing that are less complicated or cumbersome.

    // "operators" in Scala
    val tom = new Person ("Tom", "Fight Club")
    println(mary hangOutWith(tom)) // Mary is hanging out with Tom
    println(mary hangOutWith tom) // same as above.

    println(1 + 2)
    println(1.+(2)) // same as above

    //All operators are methods
    // Could be named  + - ! % etc -> where it would previously be a reserved name.

    // Prefix notation
    val x = -1 // this is a unary operator
    val y = 1.unary_- // same as above
    // unary_ prefix only works with - + ~ !

    println(!mary)
    println(mary.unary_!) //same as above.

    // postfix notation
    println(mary.isAlive)
    // println(mary isAlive) does not work for me but is meant to be the same as above.

    //apply
    println(mary.apply())
    println(mary()) // same as above

}
