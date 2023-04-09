package Homework1

fun main () {
    println("Здравствуйте, введите число от 1 до 3:")

    var number1 = readln().toString().toInt()

    println("Пожалуйста, сделайте вашу ставку:")

    var bet = readln().toString().toInt()

    val winNumber = (0..3).random()

    if (number1 == winNumber) {
        println("Вы победили! Ваш выигрыш составил:")
        bet = bet * 3
        println(bet)
    }

    else {
        println("Вы проиграли ваш депозит")
    }

    
}