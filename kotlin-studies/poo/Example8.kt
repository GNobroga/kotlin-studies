package poo

// in - Pra falar que o parâmetro genérico é de entrada.
// out - Pra falar que o parâmetro genérico é de saída.
// where - Colocar restrição no genérico
interface CustomComparable<out T> {
   fun compareObject(other: Any): T?;
}


interface Cloneable {
    fun clone();
}


interface Serializable {
    fun serialize();
}
class Example8<T> : CustomComparable<T> where T: Any {
    override fun compareObject(other: Any): T? {
        TODO("Not yet implemented")
    }

    // Colocando duas restrições no tipo T Generic.
    fun <T> doSomething(): T? where T: Cloneable, T: Serializable {
        return null;
    }

}