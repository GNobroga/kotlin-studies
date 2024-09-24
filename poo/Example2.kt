package poo

// Sealed classes não podem ser instanciadas, mas podem ser herdadas se as outras classes estiverem no mesmo arquivo.
sealed class Example2 {

    class EmailService {

        fun send(from: String, to: String, message: String) {
            println("E-mail enviado de $from para $to com a $message");
        }

        fun send(from: String, to: String) {
            send(from, to, "Hello World");
        }
    }
    // Permite declarar metódos statics.
    companion object {
        fun execute() {
            val example = EmailService();
            example.send("Gabriel", "Carlinhos");

        }
    }
}