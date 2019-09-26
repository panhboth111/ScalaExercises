package Exercises
import scala.collection.immutable._
object no_5 extends App {
  var myList = List(73,52,32,23,98)
  var result = myList.filter(x=> x>50)
  println(result)
}
