//1. Write a recursive function prime(n) that returns true for a prime number
//and false for the other? For example prime(5) should return true and
//prime(8) should return false.

object Question1 extends App{
    def gcd(a: Int,b: Int): Int = {
       if(b ==0) a 
       else gcd(b, a%b)
    }

    def prime(a:Int,b:Int=2):Boolean= b match {
       case x if(b==a) => true
       case x if gcd(a,b)>1 => false
       case x => prime(a,b+1)
    }
    
    println(prime(5,2));
}
