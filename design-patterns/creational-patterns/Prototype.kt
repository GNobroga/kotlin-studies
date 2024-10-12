package `creational-patterns`
data class User(val name: String, val lastName: String)  {

}

fun main() {
    println("Executing...")
    val user = User("Carlos", "Silva")
    val other = user.copy(name = "Miguel")
}