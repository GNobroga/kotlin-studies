package `creational-patterns`
class Product {
    var name: String? = null
    var lastName: String? = null
    val fullName get() = "$name $lastName"

    // inner permite acessar dados da instancia da classe parent.
    class Builder {
        private val target = Product()

        fun name(value: String): Builder {
            target.name = value
            return this
        }

        fun lastName(value: String): Builder {
            target.lastName = value
            return this
        }

        fun build(): Product {
            return target
        }

    }

    companion object {
        fun builder(): Builder {
            return Builder()
        }
    }
}
fun main() {
    val product = Product.builder()
        .name("Gabriel")
        .lastName("Cardoso")
        .build()

    println(product.fullName)

    product.name = "Miguel"

    println(product.fullName)
}