
fun main(args: Array<String>) {
    var num1 = readLine()!!.toFloat()
    var num2 = readLine()!!.toFloat()
    var num3 = readLine()!!.toFloat()
    var smallest=getSmallest(num1,num2,num3)
    var biggest=gitBigger(num1,num2,num3)
    var mid=gitmid(num1,num2,num3)

    println("$smallest,$mid,$biggest") }