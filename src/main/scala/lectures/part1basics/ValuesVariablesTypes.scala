package lectures.part1basics

object ValuesVariablesTypes extends App{
  val x: Int = 42
  println(x) //Same as console.log()
  // 'val' variable (is like const / immutable) | 'x' variable name | ':' means a type will follow |  Int is an integer (type)
 // types of val's are optional ->  can infer types (val x = 42 -> will work)

  // different type examples below
  val aString: String = "hello"
  val aBoolean: Boolean = true
  val aChar: Char = 'a' //Char = single character values inside single quotes
  val aInt: Int = x
  val aShort: Short = 3554 //Short integer 4 or less characters long.
  val aLong: Long = 456545464L //An integer longer than a short -> needs an 'L' at the end to identify.
  val aFloat: Float = 2.0f //Decimal needs an 'f' to identify. 32 bit version of a float.
  val aDouble: Double = 3.14 //64 bit version of a Float.

  //variables - can be redeclared when vals can't
  var aVariable: Int = 4
  aVariable = 6 // redeclaring = side effects
}
