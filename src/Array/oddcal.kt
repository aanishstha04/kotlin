package Array

fun main() {
    val arr3 = arrayOf(1, 4, 6, 7, 8, 99, 12, 3, 23)


    for (i in odd(arr3)){
        if(i!=0) {
            println(i)
        }
    }
}
fun odd(arr2:Array<Int>): IntArray {
    var arr4=IntArray(arr2.size)
    var count = 0
    for(i in arr2.indices)
    {
        if(arr2[i]%2!=0)
        {
            arr4[count]=arr2[i]
            count+=1
        }

    }
    return arr4

}