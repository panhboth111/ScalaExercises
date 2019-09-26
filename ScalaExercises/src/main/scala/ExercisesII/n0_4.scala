package ExercisesII

import scala.collection.mutable.HashSet

object n0_4 extends App{
  var HS:HashSet[Int] = HashSet()
  if(HS.isEmpty) for(i<- 1 to 5) HS +=i // I didn't want to think of 5 numbers to add, so I just used loop to add 1,2,3,4,5 to the set like this =.=' (Lazy me)
  else for(j<- HS) println(j)
  //single statement. So, it is recommended to write it this way
  //this is the same as:
  //  if(HS.isEmpty){
  //    for(i<-1 to 5){
  //      HS +=i
  //    }
  //  }
  // isEmpty is a function to check if the set is empty. if the set is empty, it will return true. Else, it will return false
  // so, if(HS.isEmpty) is the same as if(HS.isEmpty == true) or if(HS == null)

}
