package exceptions

import java.util.Objects

class Example1 {

    companion object {
        fun execute() {

            var value: Int? = null;

            try {
                if (Objects.isNull(value)) {
                    throw Exception("Value cannot be null");
                }
            } catch (error: Exception) {
                println(error.message);
            } finally {
                println("Finished");
            }


            /// função require permite fazer asserçoes
            require(10 === 20) { "Valor inválido" };

            trailingLambda { // Operador trailing lambda
                x: Int -> x.toString();
            }
        }

        // Quando o último parâmetro do método for uma lambda eu posso usar o operador trailing lambda
        private fun trailingLambda(callback: (Int) -> String) {
            println("Hello World!!");
        }
    }
}