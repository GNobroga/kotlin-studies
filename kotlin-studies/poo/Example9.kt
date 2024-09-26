package poo

// Classes Anônimas

interface Vehicle {
    fun accelerate();
}
class Example9 {

    companion object {
        fun execute() {
            // Instanciando uma classe anônima
            val vehicle = object : Vehicle {
                override fun accelerate() {
                    println("Driving...");
                }
            }
        }
    }
}