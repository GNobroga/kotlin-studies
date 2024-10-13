package structural

data class User(val name: String, val lastName: String) {}
class ServiceA {

    private val users = mutableListOf<User>(
        User(name="Gabriel", lastName="Cardoso"),
        User(name="Gabriel", lastName="Cardoso"))
    fun searchByName(name: String): List<User> {
        return users.filter {
            val (name) = it
            name.contains(name, ignoreCase = true)
        }
    }
}

class ServiceB {
    private val users = mutableListOf<User>(
        User(name="Gabriel", lastName="Cardoso"),
        User(name="Gabriel", lastName="Cardoso"))
    fun searchByLastName(lastName: String): List<User> {
        return users.filter {
            val (_, lastName) = it
            lastName.contains(lastName, ignoreCase = true)
        }
    }
}

class Facade(private val s1: ServiceA, private val s2: ServiceB) {
    fun search(term: String): List<User> {
        val data = s1.searchByName(term).toMutableList()
        data.addAll(s2.searchByLastName(term))
        return data
    }
}

fun main() {
    val facade = Facade(ServiceA(), ServiceB())
    facade.search("a").forEach {
        println(it)
    }
}