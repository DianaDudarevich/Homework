package Homework1

fun main() {
    val list = listOf(1, -1, 5, -6, -8, 15, 2, 5, -4, 8)
    var sum: Int = 0

    list.forEach {
        if (it > 0 && it % 2 == 0) {
            sum = sum + it

        }


    }

    println(sum)

}