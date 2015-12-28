package week2

object Currying
{

/*
def sum(f: Int => Int, a: Int, b: Int):  Int =
/*f is the parameter of the sum function that takes argument of type Int
and Rerurns an argument of type Int*/
if (a>b) 0
else f(a) + sum(f, a+1, b)
 

def sumIntsA(a:Int, b: Int) = sum(x=>x, a, b)

def sumcubesA(a:Int, b: Int) = sum(x=>x*x*x, a, b)

sumIntsA(1,3)

The function above takes 2 parameters everytime and passes it on to the other function
Can we get rid of this. ?
So that it becomes even shorter

The sum function takes one parameter f and it returns a function as a result
*/

def sum(f: Int => Int): (Int, Int) => Int = {
	def sumF(a: Int, b: Int) : Int =
			if (a> b) 0
			else f(a) + sumF(a+1, b)
			
			sumF
}                                                 //> sum: (f: Int => Int)(Int, Int) => Int
			
def sumInts = sum(x => x)                         //> sumInts: => (Int, Int) => Int

def sumcubes = sum(x => x*x*x)                    //> sumcubes: => (Int, Int) => Int

sumcubes(1,2)                                     //> res0: Int = 9

/*
In the above case how can we avoid middle man like sumInts sum cubes etc.
use sum(cube) (1, 10)
*/

/*
Multiple parameter expressions :
every function is mapped to an expression that consists of anonymous fnctions and nested anaonymous functions

ref : Haskell Brooks Curry
*/

def sumc(f: Int => Int)(a: Int, b: Int) : Int =
if (a>b) 0 else f(a) + sumc(f)(a+1, b)            //> sumc: (f: Int => Int)(a: Int, b: Int)Int

/*
functional types associate to the right.
(Int -> Int) => (Int, Int) => Int
equivalent to
Int => Int => Int
*/

}