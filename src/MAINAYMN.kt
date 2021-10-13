fun main(args: Array<String>) {
    var num1 = readLine()!!.toFloat()
    var num2 = readLine()!!.toFloat()
    var num3 = readLine()!!.toFloat()
    var smallest=num1
    if (smallest>=num2){
        smallest=num2
    }
    if (smallest>=num3){
        smallest=num3
    }
    var biggest=num1
    if (biggest<=num2){
        biggest=num2
    }
    if (biggest<=num3){
        biggest=num3
    }
    var mid=num1
    if (num1>num2 && num1<num3||num1<num2&&num1>num3){
        mid =  num1
    }
    if ((num2>num1 && num2<num3||num2<num1&&num2>num3))
    {mid=num2}
    if(num3>num2 && num3<num1||num3<num2&&num3>num1){
        mid=num3
    }

    println("$smallest,$mid,$biggest")
}