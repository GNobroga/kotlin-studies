
// Sealed class cannot be instantiated, only inherit.
sealed class Human(val name: String) {}

class Employee(name: String) : Human(name) {

}

fun main() {
    val human: Human = Employee("Gabriel Cardoso")
}