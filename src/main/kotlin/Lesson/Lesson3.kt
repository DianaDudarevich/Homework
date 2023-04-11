package Lesson

import kotlin.random.Random


fun main() {

    var number: Int = readln().toInt()

    var randomNumber = Random.nextInt(0,4)

    while (number != randomNumber) {

        number = readln().toInt()

    }
    println("Вы угадали, это число $randomNumber")

}


//fun main() {
//
//    var word: String = readln()
//
//
//    if (word == word.reversed() ) {
//        println("Да")
//    } else {
//        println("Нет")
//    }
//}