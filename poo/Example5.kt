package poo


// - Por padrão todas as classes são finals no Kotlin por isso elas não podem ser herdadas, exceto se utilizarmos a palavra reservada open.
// - Todas as classes herdam de Any().
// - Não existe herança múltipla.
open class Animal(name: String) {
    fun doSomething() {}
}

class Dog(name: String) : Animal(name) {}

class Example5 {

    companion object {
        fun execute() {
            // Operador is - igual ao instanceof
            var dog = Dog("Gabiroba");
            print(dog is Animal)
            // Operador as
            var animal: Dog = Animal("Garfield") as Dog;
            animal.doSomething();
        }
    }
}