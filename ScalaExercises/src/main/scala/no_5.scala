object no_5 extends App{
  // this code can be significantly minimized if we used Two-dimensional arrays.
  var student1_score = new Array[Double](5) // 5 is the size of the array
  var student2_score = new Array[Double](5)
  var student3_score = new Array[Double](5)
  var student4_score = new Array[Double](5)
  var student5_score = new Array[Double](5)
  // because there are five students, each having 5 subjects, we need 5 arrays with size of 5
  // then we input the scores of all the students
  println("Enter the scores for student 1: ")
  for(i <- 0 until 5) student1_score(i) = scala.io.StdIn.readDouble()
  println("Enter the scores for student 2: ")
  for(i <- 0 until 5) student2_score(i) = scala.io.StdIn.readDouble()
  println("Enter the scores for student 3: ")
  for(i <- 0 until 5) student3_score(i) = scala.io.StdIn.readDouble()
  println("Enter the scores for student 4: ")
  for(i <- 0 until 5) student4_score(i) = scala.io.StdIn.readDouble()
  println("Enter the scores for student 5: ")
  for(i <- 0 until 5) student5_score(i) = scala.io.StdIn.readDouble()
  // Find the total score of every student
  var totalScores = Array(student1_score.sum,student2_score.sum,student3_score.sum,student4_score.sum,student5_score.sum) //.sum is used to add the elements of the array together.
  println("Total scores: ")
  for(i<- 0 until 5) println(s"Student ${i+1}: ${totalScores(i)}")
  // Find average
  var averageScores = totalScores.map(x => x/5) // pass each element of the totalScores array in to the function. the variable "x" refers to the element that is being passed into the function. Then, divided each of them by 5
  for(i<- 0 until 5) println(s"Student ${i+1}: ${averageScores(i)}")
  // Find passing scores
  println("Pass: ")
  var passingScores = totalScores.filter(x => x>=250)
  for (i <- passingScores) println(if(passingScores) i else "None") // print the passers if there is more than one passer. else print None
  // if(passingScores) will be true if the passingScores array is not empty. Else, it will be false. It is the same as if(passingScores == null)
  // Find failing scores
  println("Fail: ")
  var failingScores = totalScores.filter(x => x<250)
  for (i<- failingScores) println( if(failingScores)  i else "None")// print the failers if there is more than one failer. else print None
  //Find highest and lowest scores
  println(s"Highest score: ${totalScores.max}")
  println(s"Lowest score: ${totalScores.min}")
}
