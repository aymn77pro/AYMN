fun main(){
    println(" put your salary")
    var salary= readLine()!!
    println("put you preformnce")
    var preformnce = readLine()!!
    if (preformnce.toInt()==1){
       var r=salary.toInt()+(salary.toInt()*0.06)
        println(r)}
    else if (preformnce.toInt()==2){
        var r=salary.toInt()+(salary.toInt()*0.04)
        println(r)
    }
    else if (preformnce.toInt()==3){
        var r=salary.toInt()+(salary.toInt()*0.015)
        println(r)
    }
    else{
        println("error")
    }
}