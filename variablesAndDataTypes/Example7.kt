package variablesAndDataTypes

class Example7 {

    companion object {
        fun execute() {
            // String
            var name = "Gabriel";

            // Template String
            var message = "Hello World $name";
            var message2 = "Hello World ${name.uppercase()}";
            println(message);

            // String block
            var message3 = """
                    %d
                    Hello World
            """.format(1).trimMargin();

            println(message3);
        }
    }
}