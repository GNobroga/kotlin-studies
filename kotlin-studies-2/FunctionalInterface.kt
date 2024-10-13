
fun interface Predicate<T> {
    fun test(obj: T): Boolean
}

fun main() {
    val predicate = object : Predicate<String> {
        override fun test(obj: String): Boolean {
            return obj.length > 5
        }
    }

    val predicate2 = Predicate<String> { it.length > 4  }
}