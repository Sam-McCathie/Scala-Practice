package lectures.part2oop

/* This section is very confusing */

abstract class MyList17 {
  /* describes a list of integers */
  /* single linked list that holds integers.
   methods
    1. head = first element of the list
    2. tail = remainder of the list -> ??????
    3. isEmpty = is this list empty
    4. add(int) => new list with this element added.
    5. toString => a string representation of the list.
  */

  def head: Int
  def tail: MyList17 // MyList17 = name of class
  def isEmpty: Boolean
  def add(n: Int): MyList17
  def printElements: String
  // Polymorphic call
  override def toString: String = "[" + printElements + "]"
}

  // ??? -> expression that returns nothing.

  object Empty extends MyList17 {
    def head: Int = throw new NoSuchElementException // causes application to crash -> returns nothing
    def tail: MyList17 = throw new NoSuchElementException
    def isEmpty: Boolean = true
    def add(n: Int): MyList17 = new Cons(n, Empty)
    override def printElements: String = ""
  }

  // h = head | t = tail
  class Cons(h: Int, t: MyList17) extends MyList17{
    def head: Int = h
    def tail: MyList17 = t
    def isEmpty: Boolean = false
    def add(n: Int): MyList17 = new Cons(n, this)
    override def printElements: String =
      if(t.isEmpty) "" + h
      else s"$h ${t.printElements}"
  }


  object ListTest extends App {
    val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
    println(list.head) // 1
    println(list.tail.head) // 2 -> new Cons(2, new Cons(3, Empty)) = the tail and 2 is at the head.
    println(list.add(4).head) // 4
    println(list.isEmpty) // false
    println(list.toString) // [1 2 3]
  }