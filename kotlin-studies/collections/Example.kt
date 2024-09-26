package collections

class Example {

    // Array - Possuem tamanho fixed
    fun example1() {
        var array: Array<Int> = Array(10) { 0 };
        array = arrayOf(1, 2, 3, 4, 5);

        println(array[0]);
        println(array[0]);

        array.forEach {
            println(it);
        }
        // arrayOf
        // arrayOfNulls
        // intArrayOf etc

        repeat(array.size) {
           i -> println(array[i]);
        }

        val intArray = intArrayOf(1, 2, 3, 4, 5);
        example2(*intArray) { // Operador spread.
            it % 2 == 0
        }
    }

    // Varargs
    fun example2(vararg args: Int, predicate: (Int) -> Boolean) {
        args.filter {
            predicate(it)
        }.forEach {
            println(it);
        };
    }

    // Collections
    // List, Set, Map - Imutaveis
    // MutableList, MutableSet, MutableMap - Mutaveis
    fun example3() {
        val imutableList = listOf(1, 2, 4);
        val mutableList = mutableListOf(1, 2, 3);
        mutableList.add(100);

        val imutableSet = setOf(1, 2, 3);
        val mutableSet = mutableSetOf(1, 2, 3);

        //val imutableMap = mapOf(Pair("token", 123));
        val map = mapOf("token" to 123); // isso criar um Pair por trás.
        val mutableMap = map.toMutableMap();
        mutableMap["new"] = 100;
        println(map["token"]);
    }
}