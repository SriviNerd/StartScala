package week2
/*
Functions that take functions as parameter or return functions as a result are called higher order functions
Eg: Summation of functions : Summation is a pattern and can be generalized.
Eg: sum of all integers between a and b
Sum of all factorials between interval and b.
Can we facor out a common pattern.

*/
object HigherOrderFunction {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(552); 

def sum(f: Int => Int, a: Int, b: Int):  Int =
/*f is the parameter of the sum function that takes argument of type Int
and Rerurns an argument of type Int*/
if (a>b) 0
else f(a) + sum(f, a+1, b);System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(20); 

def id(a: Int) = a;System.out.println("""id: (a: Int)Int""");$skip(22); 
def sqr(a: Int) = a*a;System.out.println("""sqr: (a: Int)Int""");$skip(25); 
def cube(a: Int) = a*a*a;System.out.println("""cube: (a: Int)Int""");$skip(44); 

def sumInts(a: Int, b:Int) = sum(id, a, b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(44); 
def sumSqrs(a: Int, b:Int) = sum(sqr, a, b);System.out.println("""sumSqrs: (a: Int, b: Int)Int""");$skip(46); 
def sumCubes(a: Int, b:Int) = sum(cube, a, b);System.out.println("""sumCubes: (a: Int, b: Int)Int""");$skip(272); 

/*the above can get tedious given that we need to write several auxilary functions

So lets see String ==> literal. We need not def str function insteas we can simply give println(some string value
such functions are called anonymous

)*/

println("Anonymous functions");$skip(19); val res$0 = 

(x: Int) => x*x*x;System.out.println("""res0: Int => Int = """ + $show(res$0));$skip(268); 

/*you can omit data type if the compiler can dynamically check the same
anonymous functions are syntactic sugar
Every analymous fuction can be used as a function def
Using analymous functions the above will look like
*/

def sumIntsA(a:Int, b: Int) = sum(x=>x, a, b);System.out.println("""sumIntsA: (a: Int, b: Int)Int""");$skip(52); 

def sumcubesA(a:Int, b: Int) = sum(x=>x*x*x, a, b);System.out.println("""sumcubesA: (a: Int, b: Int)Int""");$skip(14); val res$1 = 

sumInts(1,3);System.out.println("""res1: Int = """ + $show(res$1));$skip(14); val res$2 = 
sumIntsA(1,3);System.out.println("""res2: Int = """ + $show(res$2))}

}
