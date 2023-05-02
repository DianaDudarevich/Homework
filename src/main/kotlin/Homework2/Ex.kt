package Homework2

fun main () {

    var number: Int = 0
    println("Введите команду: increase, decrease или exit")
    var command = ""

    while (command != "exit") {
        command = readln().toString()

        when (command) {
            "increase" -> {
                number += 1
                println("Ваше число увеличено на 1, теперь оно равно $number")
            }
            "decrease" -> {
                number -= 1
                println("Ваше число уменьшено на 1, теперь оно равно $number")
            }
            "exit" -> {
                println("Выход из программы")
            }
            else -> {
                println("Ошибка")
            }
        }
    }
}