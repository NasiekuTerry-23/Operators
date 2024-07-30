fun main(){
    val firstNumber = 15.5f
    val secondNumber = 3.5f

    val text1 = "Beginning"
    val text2 = "Middle"
    val text3 = "End"

    //Arithmetic Operators
    println("+ * - / %")
    println("$firstNumber + $secondNumber = ${firstNumber + secondNumber}")
    println("$firstNumber - $secondNumber = ${firstNumber - secondNumber}")
    println("$firstNumber * $secondNumber = ${firstNumber * secondNumber}")
    println("$firstNumber / $secondNumber = ${firstNumber / secondNumber}")
    println("$firstNumber % $secondNumber = ${firstNumber % secondNumber}")

    println(text1 + text2 + text3)

        //Assignment Operators
    var total = 0

    total += 5
    println(total)

    total-= 3
    println(total)

    total *= 25
    println(total)

    total /= 5
    println(total)

    total %= 3
    println(total)


}