package week1
/*Finding squareroot using newton's successive approximation appoximation method : Classical method
Algorithm:
1. Start with an initial estimate value does not matter what that estimation is e: y (lets pick y = 1)
2. Repeatdly improve the estimate by taking the mean of the old estimate y and x/y
Example
X = 2; y= 1
Estimation 	Quotient	            Mean(quotient and Estimation)
1	           2/1= 2                Mean = 1.5
1.5          2/1.5 = 1.33          Mean = 1.4167
1.4167       2/1.4167 = 1.4118     Mean = 1.4142
1.4142       2/1.4142              Mean = 1.4.42
===> converges..

recursive functions in scala should have an explicit return type not important for non recursive calls
*/

object Session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(772); 
  println("Welcome to the Scala worksheet");$skip(8); val res$0 = 
  1 + 2;System.out.println("""res0: Int(3) = """ + $show(res$0));$skip(129); 
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(Improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(82); 

def isGoodEnough(guess: Double, x:Double) =
abs(guess * guess - x) / x < 0.00001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(47); 

def abs (x: Double) = if (x< 0) x * -1 else x;System.out.println("""abs: (x: Double)Double""");$skip(65); 

def Improve(guess: Double, x: Double) =
(guess + x / guess) / 2;System.out.println("""Improve: (guess: Double, x: Double)Double""");$skip(40); 

def sqrt(x: Double) = sqrtIter(1.0, x);System.out.println("""sqrt: (x: Double)Double""");$skip(9); val res$1 = 

sqrt(4);System.out.println("""res1: Double = """ + $show(res$1));$skip(10); val res$2 = 

sqrt(17);System.out.println("""res2: Double = """ + $show(res$2));$skip(9); val res$3 = 

sqrt(2);System.out.println("""res3: Double = """ + $show(res$3));$skip(14); val res$4 = 

sqrt(1.0e50);System.out.println("""res4: Double = """ + $show(res$4));$skip(13); val res$5 = 

sqrt(10000);System.out.println("""res5: Double = """ + $show(res$5))}


/*
1.  The isGoodEnough test is not very prescise for small numbers and can lead to non termination for very largenumbers Explain why
2. Design a different version of isgoodenough that does not have these problems
3. Test your solution with some very very small and large numbers
0.001
0.1e-20
1.0e20
1.0e50
devide the abs by x
*/
}
