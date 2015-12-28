package week2
/*
Functions that take functions as parameter or return functions as a result are called higher order functions
Eg: Summation of functions : Summation is a pattern and can be generalized.
Eg: sum of all integers between a and b
Sum of all factorials between interval and b.
Can we facor out a common pattern.

*/
object HigherOrderFunction {

def sum(f: Int => Int, a: Int, b: Int):  Int =
/*f is the parameter of the sum function that takes argument of type Int
and Rerurns an argument of type Int*/
if (a>b) 0
else f(a) + sum(f, a+1, b)                        //> sum: (f: Int => Int, a: Int, b: Int)Int

def id(a: Int) = a                                //> id: (a: Int)Int
def sqr(a: Int) = a*a                             //> sqr: (a: Int)Int
def cube(a: Int) = a*a*a                          //> cube: (a: Int)Int

def sumInts(a: Int, b:Int) = sum(id, a, b)        //> sumInts: (a: Int, b: Int)Int
def sumSqrs(a: Int, b:Int) = sum(sqr, a, b)       //> sumSqrs: (a: Int, b: Int)Int
def sumCubes(a: Int, b:Int) = sum(cube, a, b)     //> sumCubes: (a: Int, b: Int)Int

/*the above can get tedious given that we need to write several auxilary functions

So lets see String ==> literal. We need not def str function insteas we can simply give println(some string value
such functions are called anonymous

)*/

println("Anonymous functions")                    //> Anonymous functions

(x: Int) => x*x*x                                 //> res0: Int => Int = <function1>

/*you can omit data type if the compiler can dynamically check the same
anonymous functions are syntactic sugar
Every analymous fuction can be used as a function def
Using analymous functions the above will look like
*/

def sumIntsA(a:Int, b: Int) = sum(x=>x, a, b)     //> sumIntsA: (a: Int, b: Int)Int

def sumcubesA(a:Int, b: Int) = sum(x=>x*x*x, a, b)//> sumcubesA: (a: Int, b: Int)Int

sumInts(1,3)                                      //> res1: Int = 6
sumIntsA(1,3)                                     //> res2: Int = 6

}