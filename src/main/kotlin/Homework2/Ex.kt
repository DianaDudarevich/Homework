package Homework2

fun main () {

    var number: Int = 0
    println("Введите команду: increase, decrease или exit")
    var command = ""

    while (command != "exit") {
        command = readln().toString()

        when (command) {
            "increase" -> {
                number = number + 1
                println(number)
            }

            "decrease" -> {
                number = number - 1
                println(number)
            }

            else -> {
                println("Ошибка")
            }
        }
    }

}