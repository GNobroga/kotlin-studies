package nullables

import java.util.regex.Pattern

class Example1 {

    companion object {
        fun execute() {
            // Nullables, O kotlin me forçar tratar nulos.
            var n: Int? = null;

            // semelhante ao ?? do javascript (Operador Elvis)
            n = n ?: 100;

            n?.toDouble();

            // Operador !! semelhante ao do TS pra falar pro compilador que não é null
//            var person: Object? = null;
//            print(person!!.toString());

            var password = null as String?;

            password = password ?: "1234";

            password = "*".repeat(password.length);

            println(password);
        }
    }
}