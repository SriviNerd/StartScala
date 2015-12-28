package week2

/*
1. Write a product function that calculates the product of the values of a function for the points in a given interval
2. Write factorial in terms of product?
3.  Can you write a more general function that generalizes both sum and product?
*/

object Exersise3 {
	def product(f: Int => Int)(a: Int, b: Int): Int =
		if (a>b) 1
		else f(a) * product(f)(a+1, b)    //> product: (f: Int => Int)(a: Int, b: Int)Int
		
		product(x => x*x)(3, 4)           //> res0: Int = 144
		
		def fact(n: Int) = product(x => x) (1, n)
                                                  //> fact: (n: Int)Int
		
		fact(5)                           //> res1: Int = 120
		
		/*what we are after in 3rd q is like map reduce we need to generalize the function*/
		
		def mapreduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int) (a: Int, b:Int): Int =
		if  (a>b) zero
		else (combine(f(a), mapreduce(f, combine, zero)(a+1, b)))
                                                  //> mapreduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
//we define a function productm that uses the mapreduce concept. same way we can write the sum also

	def productm(f: Int => Int)(a: Int, b: Int): Int = mapreduce(f, (x,y) => x*y , 1)(a,b)
                                                  //> productm: (f: Int => Int)(a: Int, b: Int)Int
	def summ(f: Int => Int)(a: Int, b: Int): Int = mapreduce(f, (x,y) => x+y, 0) (a,b)
                                                  //> summ: (f: Int => Int)(a: Int, b: Int)Int
	
	def factm(n: Int) = product(x => x) (1, n)//> factm: (n: Int)Int
	
	def natsum(n: Int) = summ(x=>x)(1,n)      //> natsum: (n: Int)Int
	
  factm(5)                                        //> res2: Int = 120

	natsum(10)                                //> res3: Int = 55
		}