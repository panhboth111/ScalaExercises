object test extends App{
  var s = new Array[Int](3)
  s(0) = 7
  s(1) = 3
  s(2) = 9
//  var a = Array(s.sum,s.sum)
//  for(i<-a) println(i)
  scala.util.Sorting.quickSort(s)
  for(i <- s) println(i)
}
