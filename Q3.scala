object  Q3  extends  App {

  def sum(n : Int) : Int = n match {
    case 0 => 0
    case _ => n + sum(n-1)
  }

  print(sum(5))


}