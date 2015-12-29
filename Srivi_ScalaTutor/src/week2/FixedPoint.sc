
package week2

import math._

/*
A number x is called fixe3d point of a function if f(x) = x
Eg: f(x) = 1+ x/2
*/
object FixedPoint {

  val tolerance = 0.0001                          //> tolerance  : Double = 1.0E-4
  def isCloseEnough(x: Double, y: Double) = abs((x - y) / x) < tolerance
                                                  //> isCloseEnough: (x: Double, y: Double)Boolean
  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
  println("guess = " + guess)
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
	}                                         //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double

fixedPoint (x => 1 + x/2)(1)                      //> guess = 1.0
                                                  //| guess = 1.5
                                                  //| guess = 1.75
                                                  //| guess = 1.875
                                                  //| guess = 1.9375
                                                  //| guess = 1.96875
                                                  //| guess = 1.984375
                                                  //| guess = 1.9921875
                                                  //| guess = 1.99609375
                                                  //| guess = 1.998046875
                                                  //| guess = 1.9990234375
                                                  //| guess = 1.99951171875
                                                  //| guess = 1.999755859375
                                                  //| res0: Double = 1.9998779296875

// can we use this for SQRT(x) is the fixed point of the function (y => x/y)

//def sqrt (x: Double) = fixedPoint(y => x/y)(1.0)

// this one oscllates between 1 and 2 hence average it out

def sqrt(x: Double) = fixedPoint(y => (y + x/y) / 2)(1.0)
                                                  //> sqrt: (x: Double)Double

sqrt(2)                                           //> guess = 1.0
                                                  //| guess = 1.5
                                                  //| guess = 1.4166666666666665
                                                  //| guess = 1.4142156862745097
                                                  //| res1: Double = 1.4142135623746899

}