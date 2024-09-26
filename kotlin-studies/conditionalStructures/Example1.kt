package conditionalStructures

class Example1 {

    companion object {
        fun execute() {
            // São semelhantes as linguages que já sei.
            val temp = 2;

            if (temp > 22) {
                println("Está calor");
            } else if (temp >= 17) {
                println("Médio");
            } else {
                println("FRIO");
            }

            // Operador ternário.
            val name = if (2 % 2 == 0) "PAR" else "IMPAR"; // Sem scope block
            val name2 = if (2 % 2 == 0) {
                "PAR"
            } else {
                "IMPAR"
            }; // Com scope block

            // switch case EXEMPLO - 1
            val x = 100
            when (x) {
                1 -> print("x == 1")
                2 -> print("x == 2")
                else -> {
                    print("x is neither 1 nor 2")
                }
            }

            // EXEMPLO - 2
            val y = 200;
            // Dentro de intervalos
            when (y) {
                in 0 .. 100 -> print("Ta bom");
                in 100 .. 200 -> print("YES");
                else -> print("NoT");
            }

            val z = 5;
            // EXEMPLO - 3
            when (z) {
                1, 2, 3 -> print("PAR");
                else -> print("IMPAR");
            }

            val a = 10;
            // EXEMPLO - 4
            when {
                a > 10 -> println("Maior que 10");
                else -> {
                    print("Menor que 10");
                }
            }

            // EXEMPLO - 5
            val lastName = when (true) {
                true -> "Gabriel";
                else -> "Pedro";
            }
        }
    }
}