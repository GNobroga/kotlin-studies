
// Permite delegar a implementação de um interface

interface Parent {
    fun printSomething()
}
class ParentImpl : Parent {
    override fun printSomething() {
        println("Hello World!!")
    }
}

class SubParent(parent: Parent)  : Parent by parent {}

fun main() {
    val obj = SubParent(ParentImpl())
    obj.printSomething()
}