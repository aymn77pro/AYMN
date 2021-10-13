fun getSmallest(num1:Float,num2:Float,num3: Float):Float{ var smallest=num1
    if (smallest>=num2){
        smallest=num2
    }
    if (smallest>=num3){
        smallest=num3
    }
    return smallest
}
fun gitBigger(num1:Float,num2:Float,num3:Float):Float{
    var biggest=num1
    if (biggest<=num2){
        biggest=num2
    }
    if (biggest<=num3){
        biggest=num3
    }
    return biggest
}
fun gitmid(num1: Float,num2: Float,num3:Float): Float{
    var smallest=getSmallest(num1,num2,num3)
    var biggest=gitBigger(num1,num2,num3)
    var mid=num1
    if (num1>smallest&&num1<biggest){
        mid =  num1
    }
    else if (num2>smallest&&num2<biggest)
    {mid=num2}
    else{
        mid=num3
    }
    return mid
}
fun main(args: Array<String>) {
    var num1 = readLine()!!.toFloat()
    var num2 = readLine()!!.toFloat()
    var num3 = readLine()!!.toFloat()
    var smallest=getSmallest(num1,num2,num3)
    var biggest=gitBigger(num1,num2,num3)
    var mid=gitmid(num1,num2,num3)

    println("$smallest,$mid,$biggest") }