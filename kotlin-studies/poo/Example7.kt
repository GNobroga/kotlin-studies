package poo

// Ao usar abstract não é necessário usar o open.
abstract class Drink {

     open val variable = 100;

    // Por padrão os métodos também são finais e para permitir sobrescrever eles é necessário por o open.
    open fun prepare() {
        println("prepare DRINK");
    }

    // Métodos abstrados não são finals
    abstract fun something();

}
// Permite sobscrever uma variável
class Coffee(
        //override val variable = 200
): Drink() {

    // Permite sobscrever uma variável
    override val variable = 200;
    override fun prepare() {
        super.prepare();
        print("Proxied");
    }

    override fun something() {
       print("Something...");
    }
}

class Example7 {
}