package classandobject

class person(
    val fname: String,
    val lname: String,
    val age: Int
    )
fun main(){
    val Person1 = person("kiran", "rana", 22
    )
    val Person2 = person("anish", "shrestha", 22
    )
    val Person3 = person("salman", "khan", 22
    )

    val lstperson = mutableListOf<person>()
    lstperson.add(Person1)
    lstperson.add(Person2)
    lstperson.add(Person3)

    for (i in lstperson.indices){
        println("fname: ${lstperson[i].fname}, age: ${lstperson[i].age}")
    }
}