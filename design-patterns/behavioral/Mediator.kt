package behavioral

class Client (var name: String, val mediator: BankMediator, initialBalance: Double = 0.0) {

    private var _balance: Double = initialBalance
    val balance get() = _balance

    fun transfer(to: Client, value: Double) {
        mediator.transfer(this, to, value)
    }

    fun setBalance(value: Double) {
        _balance = value
    }
}

class BankMediator {
    fun transfer(from: Client, to: Client, value: Double) {
        if (from.balance > 0 && from.balance >= value) {
            from.setBalance(from.balance - value)
            to.setBalance(to.balance + value)
        }
    }
}

fun main() {
    val mediator = BankMediator()
    val c1 = Client(name="Gabriel", mediator, 500.00)
    val c2 = Client(name="Miguel", mediator)
    c1.transfer(c2, 500.0)
    println(c1.balance)
    println(c2.balance)
}