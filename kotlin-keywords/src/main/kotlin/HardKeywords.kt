
typealias mapper<T, R> = (T) -> (R)

open class SuperClass {}

class SubClass : SuperClass() {}

fun main(args: Array<String>) {
    // as - funciona como no Typescript
    // as? - Permite fazer o casting seguro
    val superClass: SuperClass = SubClass() // Upcasting
    val subClass: SubClass? = superClass as? SubClass // Downcasting

    // !in - É negação de quando algo não está presente no range
    val number = 100
    if (number !in 1 .. 99) {
        println("No have a number with value $number")
    }

    // is - Semelhante ao instanceof
    if (subClass is SuperClass) {
        println("Yes, the subclass is a superclass too.")
    }

    // typealias - Permite adicionar alias para um tipo
    val mapToDouble: mapper<Int, Double> = {
        value -> value.toDouble()
    }
    println(mapToDouble.invoke(100))
}