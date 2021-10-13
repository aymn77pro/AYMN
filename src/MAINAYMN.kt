
fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    println("$name your heath is ")
    if (isBlessed && healthPoints>50||isImmortal){
        println("green")
    }
    else{
        println("none")
    }
    if (isBlessed){
        println("$name is blessed")}
    else{
        println("$name is not blessed")}
    val karma = (Math.pow(Math.random(),(110 - healthPoints) / 100.0) * 20 ).toInt()
    println("$name  your karma is")
    when(karma){
       in 0..5 -> println("red")
        in 6..10 -> println("orange")
        in 11..15-> println("purle")
        in 16..20-> println("green")
    }
}