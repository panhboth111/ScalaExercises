import scala.collection.mutable._
object no_2 extends App{
  var HS:HashSet[String] = HashSet()
  for(i<- 1 to 5){
    var input = scala.io.StdIn.readLine()
    HS += input
  }
  for(j<- HS) println(j) //use for loop
  // or u can use foreach
  HS.foreach(x=>println(x))
}
