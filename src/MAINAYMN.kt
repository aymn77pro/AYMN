fun main(){
  var   x= readLine()!!
    var mark= readLine()!!
    var y= readLine()!!
    if (mark=="+"){
       var r=x.toInt()+y.toInt()
        println(r)
    }
 else if (mark=="-"){
     var r = x.toInt()- y.toInt()
        println(r)
    }
else if (mark=="*"){
    var r=x.toInt()*y.toInt()
    println(r)
    }
    else if (mark=="/") {
        var r = x.toInt() / y.toInt()
        println(r)
    }else if (mark=="%"){
        var r=x.toInt()%y.toInt()
        println(r)}

    }



