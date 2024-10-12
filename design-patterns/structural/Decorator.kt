package structural

interface Item {
    fun getPrice(): Double
}
class Product(val name: String, private val price: Double) : Item {
    override fun getPrice(): Double {
        return price
    }
}

abstract class ItemDecorator(private val item: Item) : Item {
    override fun getPrice(): Double {
        return item.getPrice()
    }
}

class DoublePriceItemDecorator( private val item: Item) : ItemDecorator(item) {
    override fun getPrice(): Double {
        return super.getPrice() * 2
    }
}

fun main() {
    val product = Product("Smartphone", 200.00)
    val decorator: ItemDecorator = DoublePriceItemDecorator(product)
    println(decorator.getPrice())
}