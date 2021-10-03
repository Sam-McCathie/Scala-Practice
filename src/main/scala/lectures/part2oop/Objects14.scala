package lectures.part2oop

//lesson 14 - Scala objects.

  object Objects14 extends App{
  // Scala does not have class level functionality ("static").

  object Person { // Define type and its only instance
  // "static"/"class" - level functionality.
  val N_EYES = 2
  def canFly: Boolean = false

  //factory method
  def apply(mother: Person, father: Person): Person = new Person("Potato")
  }

  class Person(val name: String) {
    // instance-level functionality
  }

  val mary = new Person("Mary")
  val john = new Person("John")

  //COMPANIONS - The Person Object & Person Class are companions because they reside in the same scope and have the same name.

  println(Person.N_EYES) // 2
  println(Person.canFly) // false

  val Potato = Person.apply(mary, john)

  //Scala Applications = Scala object with the below method
  // def main(args: Array[String]): Unit
}
