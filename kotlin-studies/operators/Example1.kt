package operators

class Example1 {
    companion object {
        fun execute() {
            // Operadores
            // (+ - * / %) <-  Matemáticos
            print(2 * 2)
            // (== != > < >= <=) <- Comparativos
            print(2 == 2)
            // (&& || !) - Lógicos - Primeiro é feito as negações, depois os ands e dps os ors.
            print(2 == Math.random().toInt() * 2)
            // += ++ -= --
            var count = 10;
            count--;
        }
    }
}