import scala.collection.mutable._
object no_3 extends App{
  var HS:HashSet[Int] = HashSet(1,2,3,4,5)
  for (i <- HS) if(i<5) HS-=i//remove the element if it is less than 5 (<5)
  for (k <- HS) println(k)
}
