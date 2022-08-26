//3. Write a recursive function returns the addition of numbers from1 to n?
//For example sum(5) should print 15

object Question3 extends App {
    var b:Int = 0;
    def sum(a:Int): Unit={
        b = b + a; 
        if(a>0) sum(a - 1);
        else print(b); 
    }

    sum(5);
}