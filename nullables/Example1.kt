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

            if (password == null) {
                password = "1234";
            }

            var encodedPassword = "";
            for (i in password.indices) {
                encodedPassword += "*";
            }

            print(encodedPassword);
        }
    }
}