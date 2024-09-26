package extensionFunctions

// Adiciona uma metodo de extensão.
fun List<Int>.makeAllSum(): Int {
    // this é a própria lista.
    return this.reduce { acc, y -> acc + y }
}
class Example {

    companion object {
        fun execute() {
            val numbers: List<Int> = listOf(1, 2, 3);
            numbers.makeAllSum();
        }
    }
}

