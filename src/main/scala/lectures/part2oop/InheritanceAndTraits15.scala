package lectures.part2oop

object InheritanceAndTraits15 extends App{

  // Single class inheritance -> can only extend one class at a time.
  class Animal { // Adding {final} before class with mean that the class cannot be changed or extended.
    val creatureType = "wild"
    def eat = println("nomnom") // by adding {final} before def it means that method eat cannot be overridden -> like const.
    // private def eat = println("nomnom") -> if this is how the above was then cat.eat would not be able to be called.
    // private would make this method only avaiable inside this class only.

    protected def eating = println("nomnomnomnom")
    // protected = marks usable only within the current class and within subclasses.
  }

  class Cat extends Animal // extending a class means inheriting all the non-private fields and methods.
  // Cat = subclass of Animal
  // Animal = superclass of Cat.

  class Dog extends  Animal {
    def crunch = {
      eating // only accessable inside the subclass.
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.eat // nomnom

  val dog = new Dog
  dog.crunch // nomnomnomnom crunch crunch

  // constructors
  class Person(name: String, age: Int)
  class Adult(name: String, age: Int, idCard: String) extends Person(name,age) // Person needs to be called before you can call adult. Therefore its arguments also need to be passed.

  // overriding
  class Horse extends Animal {
    override val creatureType = "domestic"
    override def eat = println("neigh neigh")
  }

  val horse = new Horse
  horse.eat // neigh neigh -> instead of nomnom.
  println(horse.creatureType) // domestic -> instead of wild

  // Recap
  // Overriding = Supplying a different implementation in different derived classes.
  // Overloading = Supplying multiple methods with different signatures with the same name in the same class.

  // preventing overrides.
  // 1 - use keyword final
  // 2 - use final on the entire class
  // 3 - seal the class = extends classes in this file -> prevents extension in other files.
}
