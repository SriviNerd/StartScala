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

object Session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  1 + 2                                           //> res0: Int(3) = 3
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(Improve(guess, x), x)           //> sqrtIter: (guess: Double, x: Double)Double

def isGoodEnough(guess: Double, x:Double) =
abs(guess * guess - x) / x < 0.00001              //> isGoodEnough: (guess: Double, x: Double)Boolean

def abs (x: Double) = if (x< 0) x * -1 else x     //> abs: (x: Double)Double

def Improve(guess: Double, x: Double) =
(guess + x / guess) / 2                           //> Improve: (guess: Double, x: Double)Double

def sqrt(x: Double) = sqrtIter(1.0, x)            //> sqrt: (x: Double)Double

sqrt(4)                                           //> res1: Double = 2.0000000929222947

sqrt(17)                                          //> res2: Double = 4.123106716962795

sqrt(2)                                           //> res3: Double = 1.4142156862745097

sqrt(1.0e50)                                      //> res4: Double = 1.0000003807575104E25

sqrt(10000)                                       //> res5: Double = 100.00000025490743


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