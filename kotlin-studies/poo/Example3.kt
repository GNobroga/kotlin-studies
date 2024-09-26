package poo

class Example3 {

    // object permite definir um classe sigleton onde todos os métodos são statics e properties.
    // Eles não suportam construtores
    object CustomMath {

        const val PI = 3.14;
        fun sum(vararg args: Int): Int {
            return args.sum();
        }
    }
}