package map
//Map<k,v>
//k = key
//v = value
fun main(){
  /*  val students = arrayOf("Kiran","Bipin","Samina")
    val marks = arrayOf(55,66,77)*/
    val studentMarks = mapOf(
        "kiran" to 55,
        "Bipin" to 66,
        "Samina" to 77
    )
/*    println("All keys are : ${studentMarks.keys}")
    println("All keys are : ${studentMarks.values}")*/
    println("Enter student name : ")
    val name = readLine()!!
    println("Sttudent $name mark is : ${studentMarks[name]}")
}