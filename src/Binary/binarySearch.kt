package Binary
fun main(){
    println("Enter the number to Search:")
    var num = readLine()!!.toInt()
    var arr = arrayOf(1,2,3,4,5,6,7,8,9,10)
    var arraySize = (arr.size-1)
    val i = 0
    var msg = "Entered Number is not in the array"
    var searchResult = BinarySearch(arr,num, arraySize, i )
    if (searchResult == -1){
        println(msg)
    }
    else{
        msg = "Found"
        println(msg)
    }
}

fun BinarySearch(arr: Array<Int>, num: Int, arraySize : Int, i : Int):Int{
    if( arraySize >= i){
        var mid = i+(arraySize - i)/2
        if(arr[mid] == num){
            return mid
        }
        if(arr[mid]> num){
            return BinarySearch(arr, num, mid-1,i)
        }
        else{
            return BinarySearch(arr, num, arraySize,mid+1)
        }
    }
    return  -1;
}
