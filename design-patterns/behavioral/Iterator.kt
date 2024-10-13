package behavioral

// Define como iterar sobre algo
class Iterator(private val values: Array<*>) {
    private var currentElement = 0

    fun next(): Any {
        if (hasNext()) {
            return values[currentElement++] as Any
        } else {
            throw IndexOutOfBoundsException("No more elements")
        }
    }

    fun hasNext(): Boolean {
        return currentElement < values.size
    }
}

fun main() {
    val iterator = Iterator(arrayOf(1, 2, 3, 4, 5, 6))

    while (iterator.hasNext()) {
        println(iterator.next())
    }
}