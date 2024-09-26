package variablesAndDataTypes

class Example9 {

    companion object {
        fun execute() {
            // Readln
//            print("Type your name: ");
//            val text = readln();
//            println(text.reversed())
//
//            val scanner = Scanner(System.`in`);
//            val value = scanner.nextInt();
//
//            println(value);
//
//            scanner.close();

            println("Your name: ")
            val name = readlnOrNull();
            println("Your age: ")
            val age = readlnOrNull()?.toInt();
            println("Your weight: ")
            val weight = readlnOrNull()?.toDouble();

            println("Meu nome é $name e eu tenho $age e meu peso é $weight")

        }
    }
}