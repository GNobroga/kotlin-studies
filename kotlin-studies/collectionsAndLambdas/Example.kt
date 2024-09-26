package collectionsAndLambdas

class Example {

    fun example1() {
        val names = listOf("Gabriel", "Pedro", "Maria");
        names.filter { it.length < 2 };
        names.map { it.uppercase() };
        names.distinctBy() { it.length };
        names.sortedBy {  it.length };
        names.shuffled();
        names.take(2);

        names.random(); // retorna 1 elemento randomica que estiver dentro da lista.
        names.count();
        names.sumOf { it.length } // somar por property
        names.reduce { acc, name ->
                println(name);
                ""
        };

       // maxBy, maxOf, minBy, minOf
        // find, first, firstOrNull
        // any, all, none
        // joinToString
        // associate
        // associateBy
        // groupBy
        // groupingBy

    }
}