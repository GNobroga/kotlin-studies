
class AnyObject {

    var property: Int = 0
}


fun main() {
    // Allow configure object properties
    val anyObject = AnyObject().apply {
        property = 100
    }

    var a = 1
    val b = 2

    var result = b.also {
        100
    }
    println(result)
}