package loopStructures

class Example1 {

    companion object {
        fun execute() {
            var count = 0;

            // While
            while (count < 10) {
                print("$count ");
                count++;
            }


            // Do while
            do {
                print("Hello $count");
                count++;
            } while(count < 20);

            // For
            for (i in 0 .. 10) {
                print(i)
            }
            // Vai até 0 decremntando 5
            for (i in 10 downTo 0 step 5) {
                println(" ($i) ");
            }

            // Começar de 100 e vai até 200, com passo de 5
            for (i in 100 until 200 step 5) {
                println(" ($i) ");
            }

            // Continue operator
            for (i in 0 .. 10 step 3) {
                if (i % 2 == 0) {
                    continue;
                }
                println(" T($i) ");
            }

            // Break
            for (i in 0 .. 10 step 2) {
                if (i == 5) {
                    break;
                }
            }
            print("Finished!");

            // Labels
            // Permite dar um nome para um loop pra poder sair dele pelo break ou continue
            loop@ for (i in 0 until 20) {
                for (j in 0 .. 10 step 2) {
                    if (i == j) {
                        break@loop;
                    } else {
                        continue@loop;
                    }
                }
            }
        }
    }
}