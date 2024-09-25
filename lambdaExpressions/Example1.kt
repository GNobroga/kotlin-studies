package lambdaExpressions

import kotlin.random.Random


class Example1 {

    companion object {

        fun execute() {
            val callback = ::sum; // Passando por referencia

            val fnc = fun (a: Int): Int { // Por atribuição
                return a * 100;
            }

            callback(10, 20);
            // fnc.invoke(10); // Muito parecido com c#
            fnc(10);

            // Toda expressão lambda fica entre {}
            val f2 = { x:Int -> x * 200 };
            f2.invoke(100);

            val f3 = {
                x: String -> {
                    println(x);
                    x; // A última linha é sempre o retorno
                }
            }

            //trailing lambda
            total(10, 20) {
                x: Int -> {
                    println(x);
                }
            }

            repeat(4) { // repete o código 4 vezes.
               println(it);
            }


            // Quando a expressão lambda possui apenas 1 parametro o kotlin permite usar essa sintaxe abaixo
            val lambda: (Int) -> Int = { it * 20 };
        }
        private fun sum(a: Int, b: Int): Int {
            return a + b;
        }

        private fun total(a: Int, b: Int, lambda: (Int) -> Unit): Int {
            lambda(sum(a, b));
            return sum(a, b);
        }

        private fun newGenerator(min: Int, max: Int): () -> Int {
            //return { Random.nextInt(min, max) }; // Quando só tem retorno na lambda
            return { -> Random.nextInt(min, max) } // Alternativa
        }
    }

}