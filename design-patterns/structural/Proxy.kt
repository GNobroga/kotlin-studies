package structural

import java.lang.RuntimeException
import kotlin.random.Random


interface Something {
    fun sendMessage(from: String, to: String)
}
data class Client(val name: String, val role: String) : Something {
    override fun sendMessage(from: String, to: String) {

    }
}

class ClientProxy(private val client: Client) : Something {
    override fun sendMessage(from: String, to: String) {
        val isAuthenticated = Random.nextInt() % 2 === 0
        if (isAuthenticated) {
            throw RuntimeException("User not authenticated")
        }
        client.sendMessage(from, to)
    }

}

fun main() {
    val client = Client("Gabriel", "USER")
    val proxy = ClientProxy(client)
    proxy.sendMessage(client.name, "Pedro")
}