package Homework3

fun main(){
//    val dog: Dog = Dog("Шарик", 5, "всеядный", "домашний")
//    val cat: Cat = Cat("Барсик", 3, "всеядный", "домашний")
//    val mouse: Mouse = Mouse("Саня", 2, "всеядный", "домашний")

    val dog: Animal = Dog("Шарик", 5, "всеядный", "домашний")
    val cat: Animal = Cat("Барсик", 3, "всеядный", "домашний")
    val mouse: Animal = Mouse ("Саня", 2, "всеядный", "домашний")

    // в первых 3 случаях вызываются все методы (как наследованные, так и приобретенные), а в остальных 3 случаях - только наследованные.

    if(dog is Animal) {
        println(dog.information())
    }
    if(dog is Dog){
        println(dog.voice())
    }
    if(dog is Cat){
        println(dog.information())
    }
    if(dog !is Cat){
        println("я собака блять")
    }
}

class Mouse(
    val mouseName: String,
    val mouseAge: Int,
    val mouseWayOfEating: String,
    val mouseHabitat: String
):Animal(mouseName,mouseAge,mouseWayOfEating,mouseHabitat){
    override fun voice() {
        println("пи")
    }
    fun crunch(){
        println("Погрызть что-нибудь")
    }
}

class Cat(
    val catName: String,
    val catAge: Int,
    val catWayOfEating: String,
    val catHabitat: String
):Animal(catName,catAge,catWayOfEating,catHabitat){
    override fun voice() {
        println("мяу")
    }
    fun lazy(){
        println("Спать весь день")
    }
}

class Dog(
    val dogName: String,
    val dogAge: Int,
    val dogWayOfEating: String,
    val dogHabitat: String
):Animal(dogName,dogAge,dogWayOfEating,dogHabitat){
    override fun voice() {
        println("гав")
    }
    fun safe(){
        println("Охранять")
    }
}

abstract class Animal(
    val name: String,
    val age: Int,
    val wayOfEating: String,  //плотоядное, травоядное
    val habitat: String   //домашний, дикий
){
    fun information(){
        println("Меня зовут $name, мне $age. Мои предпочтения в еде - $wayOfEating. И я $habitat.")
    }
    abstract fun voice()
}

