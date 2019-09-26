package ExercisesII

import scala.collection.mutable.HashSet

object no_1 extends App{
  var HS:HashSet[Int] = HashSet(1,2,3,4,5)
  for (x<-HS) println(x) //when the for loop contains only one statement, you should remove the curly brackets and write it like this
}
