package variablesAndDataTypes

class Example1 {

    companion object {
        fun execute() {
            val MAX_SIZE = 100; // Imutável
            println("Variável declarada com val é imutável $MAX_SIZE");

            var currentSize = 1; // Mutável
            println("Variável declarada com var é mutável $currentSize");

            val nextNumber: Int; // Permite declarar a variável mais tarde
            nextNumber = 20;
        }
    }
}