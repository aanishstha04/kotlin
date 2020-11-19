package classandobject

class arithmetic{
//Data members/ porperties/ state
    var first : Int = 0
    var second : Int = 0
//behaviour /functions

    fun add() : Int{
        return first + second
    }
    fun subtract() : Int{
        return first - second
    }

}

fun main(){
    val Arithmetic = arithmetic()
    Arithmetic.first = 3
    Arithmetic.second = 4
    print("Sum is ${Arithmetic.add()}")
    print("  Sum is ${Arithmetic.subtract()}")
}