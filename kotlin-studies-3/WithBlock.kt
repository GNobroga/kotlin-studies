

data class Point(val x: Double, val y: Double) {
    fun multiply(): Double {
        return x * y
    }
}

fun main(args: Array<String>) {

    val point = Point(100.0, 200.0)

    // This block allowed access the properties of the target object
    with(point) {
       println(multiply())
    }
}