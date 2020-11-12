package Array

fun main() {
    val arr = arrayOf(1, 4, 6, 7, 8, 99, 12, 3, 23)


    for (i in even(arr)){
        println(i)
    }
}
fun even(arr:Array<Int>): IntArray {
    var arr2=IntArray(arr.size)
    var count = 0
    for(i in arr.indices)
    {
        if(arr[i]%2==0)
        {
            arr2[count]=arr[i]
            count+=1
        }

    }
    return arr2

}