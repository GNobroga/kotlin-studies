package poo

import kotlin.math.pow;

// Permite declarar alias para um tipo
typealias MatSumOperation = (Int, Int) -> Int;
typealias PersonName = String;

// Cria uma classe utilitária (Singleton).
object CustomMath {
    fun sum(): Int {
        return 10;
    }
}

class Example4 {

    class Rectangle {

        // Por padrão o Kotlin cria Getter e Setter padrões que só recebe e retornam
        private var width: Int = 0
            get() {
                return field;
            }
            set(value) {
                if (value < 10) {
                    return;
                }
                field = value;
            }

        // Computed field, semelhante ao que existe no C#
        val area get() = width.toDouble().pow(2 as Double);

        // Bloco de inicialização, é chamado a cada vez que uma instância é criada.
        init {
            println("Hello Brazil");
            CustomMath.sum();

            var lambda: MatSumOperation = { x: Int, y: Int -> x + y };
            lambda(10, 20);

            var personName: PersonName = "Gabriel";
            personName.uppercase();
        }
    }
}