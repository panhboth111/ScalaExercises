package Exercises
import scala.collection.immutable._
object no_4 extends App{
  var myList = List(1,2,3,4,5)
  var result = myList.map(x=> if(x%2==0) x-1 else x+2)
  println(result)
}
