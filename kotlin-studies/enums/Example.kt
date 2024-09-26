package enums

// Enums podem implementar interfaces

interface Comparable {
    fun isEqual(other: Any): Boolean;
}
enum class DaysOfWeek(val value: String) : Comparable {
    ONE("name") {
        override fun apply() {
            TODO("Not yet implemented")
        }
        // implementado interface comparable.
        override fun isEqual(other: Any): Boolean {
            TODO("Not yet implemented")
        }
    };

    // Static block
    companion object {}

    // Enums podem ter métodos abstratos que deverão ser implementados.
    abstract fun apply();
}
class Example {

    fun example1() {
        println(DaysOfWeek.ONE.value);
    }
}