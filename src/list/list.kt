package list

fun main() {
    // Immutable list
//    val listNumber = listOf("tiktok vid1","tiktok vid2", "tiktok vid3", "tiktok vid4")
//    for(i in listNumber.indices){
//        println(listNumber[i])
//    }

    //Mutable list
    val listNumber = mutableListOf("tiktok vid1", "tiktok vid2", "tiktok vid3", "tiktok vid4")
    for (i in listNumber.indices) {
        println(listNumber[i])
    }
    println("After swipe")
    listNumber.add("tiktok vid5")
    listNumber.add("tiktok vid6")
    listNumber.add("tiktok vid7")
    for (i in listNumber.indices) {
        println(listNumber[i])
    }
}