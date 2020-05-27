object  Q6 extends  App {

  def fib(n : Int) : Int = n match {

    case 0 => 0
    case x if(x==1) => 1
    case _ => fib(n-1) + fib(n-2)

  }

  def fibonacciSeq(n:Int):Unit= {
    if (n > 0) fibonacciSeq(n-1)
    println(fib(n))
  }

  print(fibonacciSeq(5))
}
