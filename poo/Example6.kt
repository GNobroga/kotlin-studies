package poo


// data class permite criar records.
// elas já vem com equals e fazem comparação do valor.
data class Person(val name: String);
class Example6 {

    companion object {
        fun execute() {
            val person = Person("José Carlos");
            val person2 = person.copy(name="Pedroca");
        }
    }

}