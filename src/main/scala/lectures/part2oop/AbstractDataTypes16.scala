package lectures.part2oop

object AbstractDataTypes16 extends App{

// Abstract classes - classes that contain uniplemented or abstract fields or methods.
// The purpose for doing this is to allow the subclasses to do this for you.
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "doggie"
    override def eat: Unit = println("nom nom")
  }
  // override is not required but helps with readability for me to start off with.

  // traits
  trait Carnivore {
    def eat (animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore { // can mix multiple traits with x with y with z etc
    override val creatureType: String = "Croc"
    override def eat: Unit = println("Chomp chomp")
    override def eat(animal: Animal): Unit = println(s"Chompy chomp chomp I eat a ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile

  croc.eat(dog)
  croc.eat

  // traits vs abstract classes -> can have both abstract and non-abstract members
  // 1. traits
  //  - do not have constructor parameters.
  //  - Can mix in multiple traits.
  //  - traits are used for behaviour.
  // 2. abstract classes
  //  - can only extend one class
  //  - describes things.

}