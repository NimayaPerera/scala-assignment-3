

object  Q2  extends  App {

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (x == p) => true
    case x if GCD(p, x) > 1 => false
    case x => prime(p, x + 1)
  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => GCD(x, a)
    case _ => GCD(b, a % b)
  }

  def primeseq(n: Int, k: Int = 2): Any = {

        if(prime(n) == true && n>2) print(n)
         print("\n")
        if(n>=2) primeseq(n-1)

  }
  print(primeseq(10))
}




