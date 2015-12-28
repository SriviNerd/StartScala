package week1
/*
Function call with value assignments can be replaced in the definition it self
GCD : Greatest common divisor - Euclid Algorithm
Logic: if gcd(a,b) need to be evaluated. First if b is = 0 then a is the GCD else recursively call gcd (b, a % b)
% ==> Modulo arithmatic operator (reminder)
a  modulo n (abbreviated as a mod n) is the remainder of the Euclidean division of a by n.
*/

/*
n! for a number is a recursive problem

factorial(x) is if x = 0 then 1 else factorial (x-1)

If a function calls itself as its last action the functions stackframe can be reused. This is called tail recurrsion. Tail recursive function
are iterative procecsses
If the last action of a function consists of calling a function (which may be the same) then
one stackframe would be sufficient for both the functions. Such calls are tail calls.

GCD in else part calls itself as last action
whereas in factorial it depends on the result of the past call. Still work was to be done. Thi sis not tail call.  There
is a build up of iist of values.

Use @tailrec to avoid very deep recursive chains (JVM limitation couple of thousand stack frame  avoid stack overflow)
It is clarity Vs efficiency
Premature optimization is the sourse of all evil - Knuth!

LOL!
 factorial(1000000)

*/

object TailRecursion {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1344); 
  println("Welcome to the Scala worksheet");$skip(193); 

  def factorial(n: Double): Double = {
  /*--use a loop function to use tail recur*/
  def loop(acc:Double, n: Double) : Double =
   if (n== 0) acc
   else loop(acc * n, n-1)
   loop(1,n)
  };System.out.println("""factorial: (n: Double)Double""");$skip(17); val res$0 = 
  factorial(100);System.out.println("""res0: Double = """ + $show(res$0))}
}
