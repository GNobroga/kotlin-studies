package functions

import java.lang.RuntimeException
import java.util.function.BiFunction

class Example {

    // Todas as funções por padrão são públicas
    // É possível definir valores padrões.
    fun sayHello(arg1: Int, arg2: Int = 10): Int {
        print("$arg1 and $arg2");
        return arg1 + arg2;
    }

    // Operador Spread
    fun calc(vararg values: Int): Int {
        return values.sum();
    }

    // Quando não se especifica o retorno é retornado Unit, ou seja, não retorna nada.
    fun doSomething(): Unit {
    }

    // Funções que retorna Nothing são funções que lançam execeção.
    fun doNothing(): Nothing {
        TODO(); // Lança um execeção quando o código não está implementado.
    }

    // Shorthand para funções que só tem retorno simples
    fun mutiply(x: Int, y: Int) = x + y;

    companion object {
        fun execute() {
            val obj = Example();
            obj.sayHello(arg2=10, arg1=10); // Parâmetros nomeados.
            println();
            print(obj.calc(1, 2, 3));
            var values: IntArray = intArrayOf(1, 2, 3, 4);
            obj.calc(*values);
            println();
            print(obj.mutiply(2, 5));
        }
    }
}