package week3
// This package abstracts rational number in a data astructure



object Rationals {
 val x = new Rational(1,3)                        //> x  : week3.Rational = 1/3
 val y = new Rational(5,7)                        //> y  : week3.Rational = 5/7
 val z = new Rational(3,2)                        //> z  : week3.Rational = 3/2
 
 x.numer                                          //> res0: Int = 1
 x.denom                                          //> res1: Int = 3
 
 y.numer                                          //> res2: Int = 5
 y.denom                                          //> res3: Int = 7
 
 z.numer                                          //> res4: Int = 3
 z.denom                                          //> res5: Int = 2
 
 
 x.add(y)                                         //> res6: week3.Rational = 22/21
 x.less(y)                                        //> res7: Boolean = true
 x.max(y)                                         //> res8: week3.Rational = 5/7
/*
def addRational(r: Rational, s: Rational): Rational =
	new Rational(
		r.numer *s.denom + s.numer*r.denom,
		r.denom*s.denom)
		
def makeString(r: Rational) = r.numer + "/" + r.denom
 
 makeString(addRational(new Rational(1,2), new Rational(2,3)))
*/
}


// rational number is a number x/y where y <>0
// x and y are integers and acare called numerator and denominator respectively.
// In scala abstraction is achied useing classes
// we will create a class of rational  number called Rational that will contain elements and methods
// a constructor rational will be used to create elements or objects of the class
// scala keeps the type(class) and value Rational in a different namespaces
// type = set of values = objects.


//Data Abstration : Ability to choose different implementations of the data without affecting clients is called data abstraction

class Rational (x: Int, y: Int)  {

require(y != 0, "denominator should be nonzero")

// the condition y = 0 will lead to infinite number so we need to validate the same before using the rational number

// Require is used to enforce a pre-condition on the callerof a function
// Assert is used as to check the code of the function itself
// Both throws an exception

// reduce the rational number so that we use the rational numbers in the simplest form

private def gcd(a:Int, b:Int) : Int = if (b == 0) a else gcd(b, a%b)
private val g = gcd(x,y)

def numer = x / g
def denom = y / g

// In scala a class implicitly introduces a constructor. this one is called primary constructor of the class
 
//def this(x: Int) = this(x,1)

// above is an implict constructor that makes the denominator = 1

// Following function returns true if one rational number is less than the other
def less(that: Rational) = numer* that.denom < that.numer * denom

// to return themaximum of two rational numbers
def max(that: Rational) = if (this.less(that)) that else this

//this takes only one argument because the left operand of is the argument itself.
def add(that: Rational) =
	new Rational(
			numer * that.denom + that.numer*denom ,
			denom * that.denom
			)
			
override def toString = numer + "/" + denom

def neg = 	new Rational( numer * -1, 		denom)

//more elegant way to program because we dont have to rewrite
def sub(that: Rational) = add(that.neg)


 }