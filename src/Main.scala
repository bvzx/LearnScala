object Main {

  def main(args: Array[String]): Unit = {
    println(add(1,3,4,4,5,6,7,8,9,11))
  }

  def add(y:Int*):Int={
    var sum=0
    y.foreach(sum+=_)
    for (x<-y) println(x)
    if (sum>123) 123 else sum
  }

}
