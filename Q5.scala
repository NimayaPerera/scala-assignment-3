object  Q5 extends  App {

  def sumofeven(n : Int) : Int  = n match{

    case 0 => 0
    case x  if(even(n)) => n+(sumofeven(n-1))
    case x  if(odd(n)) => (sumofeven(n-1))
  }




  def even(n :Int) : Boolean = n match {
    case 0 => true
    case _ => odd(n-1)
  }

  def odd(n:Int) : Boolean = !(even(n))

  print(sumofeven(5))

}
