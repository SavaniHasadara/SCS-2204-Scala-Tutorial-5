//2. Write a recursive function primeSeq(n) that prints all prime number
//which less than n? For example prime(10) should print 2,3,5, and 7 on the
//terminal.

object Question2 extends App {
   def gcd(a: Int,b: Int): Int = {
       if(b ==0) a 
       else gcd(b, a%b)
    }
    
    def prime(a:Int, b:Int = 2): Boolean = b match{
        case x if(x==a)=>true;
        case x if gcd(a,x)>1 => false;
        case x => prime(a,x+1);
    }
    def primeSeq(n:Int) : Unit={
        if(n>1){
            primeSeq(n-1);
            if (prime(n)) println(n);
        }
    }

    primeSeq(10);
}