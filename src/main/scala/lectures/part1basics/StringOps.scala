package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello, I'm learning Sala"

  //Java methods
  println(str.charAt(4)) // starts at 0 -> will return 'o'
  println(str.substring(7,11)) // I'm
  println(str.split(" ").toList) // List(Hello,, I'm, learning, Sala)
  println(str.startsWith("Hello")) // true -> returns boolean
  println(str.replace(" ", "-")) // Hello,-I'm-learning-Sala
  println(str.toLowerCase()) // hello, i'm learning sala
  println(str.length) // 24

  //Scala methods
  val aNumberString = "2"
  val aNumber = aNumberString.toInt // converts a string to an integer
  println("Start" +: aNumberString :+ "End")
      //Pre-pending +: meaning add to the start
      //Appending :+ meaning add to the end
  println(str.reverse) // alaS gninrael m'I ,olleH
  println(str.take(10)) // Hello, I'm -> kinda like substring but starts at automatically.

  // Scala-specific: string interpolators

  // S-interpolators
  val name = "Sam"
  val age = 25
  val greeting = s"Hello my name is $name and I am $age years old"
  val anotherGreeting = s"Hello my name is $name and I am turning ${age + 1} years old."
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.3f burgers per minute"
  println(myth) //Sam can eat 1.200 burgers per minute
  // the %s defines that the value should be of type string. (not required)
  // the %2.2f meaning 2 characters minimum and 3 characters precision / decimals

  // raw-interpolator
  println(raw"This is a \n newline") // This is a \n newline
  val escaped = "This is a \n newline"
  println(raw"$escaped")
//    This is a
//     newline
  // values inserted inside a raw interpolator will not be escaped.
  // variables inserted inside raw interpolators will be escape.
}
