```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

implicit class IntToMyClass(x: Int) {
  def toMyClass: MyClass = new MyClass(x)
}

implicit class MyClassToInt(x: MyClass) {
  def toInt: Int = x.x
}

object Main extends App{
  val a = 5
  val b = 10
  //Explicit type conversions
  val result = a.toMyClass.myMethod(b.toInt)
  println(result) // Output: 15
}
```