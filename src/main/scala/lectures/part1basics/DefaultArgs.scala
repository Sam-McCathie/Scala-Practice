package lectures.part1basics

object DefaultArgs extends App{
  // Adding = allows you to set the default values
  def savePicture (format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("Saved " + format)
    savePicture() //If I call the function with this it will use the default values only.
    savePicture("peg", 1337, 1000) //Default values can be overridden
    savePicture(width = 200, height = 400, format = "tree") // You can redefine the values passed in a different order if you first declare what they are.
      // If you add these out of order and without labels it will not work. e.g. (200, 400, "tree") <- will  not work.


}
