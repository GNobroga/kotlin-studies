
class Customer public constructor(val name: String) {
    init {
        println("Init is started first constructor")
    }
}

interface A {
    fun something() {
        println("A")
    }
}

interface B {
    fun something() {
        println("B")
    }
}

class AB : A, B {
    override fun something() {
        super<A>.something()
        super<B>.something()
    }
}

fun main() {
    val customer = Customer("Gabriel")
    val ab = AB()
    ab.something()
}