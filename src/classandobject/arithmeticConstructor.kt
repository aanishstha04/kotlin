package classandobject

import java.lang.ArithmeticException

class arithmeticConstructor
constructor(val first:Int, val second:Int){
    fun add(): Int{
        return first+second
    }
}


fun main(){
    val arithmetic = arithmeticConstructor(3,5)
    print("Sum of ${arithmetic.first} and ${arithmetic.second} is ${arithmetic.add()}")
}