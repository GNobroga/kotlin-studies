package poo

import java.util.UUID

class Example1 {

    // Primary Constructor com inicialização das properties. (Semelhante ao Typescript)
    class Account(val name: String, val owner: String, balance: Double = 0.0) {
        //        var name: String = name; // Property
        //        var owner: String = owner; // Property
        //        var balance: Double = initialBalance; // Property

        // Getter e Setters - Por padrão o kotlin cria automaticamente, mas se for necessário pode ser feito o código abaixo.
        var balance: Double = 0.0
            get() {
                return field; // Field é o próprio _balance
            }
            set(value) {
                if (value > 0) {
                    field = value;
                }
            };

        // Semelhante ao C#
        constructor(): this(name = "Gabriel", "123") {}

        fun deposit(amount: Double) {
            this.balance +- amount;
        }
    }

    companion object {
        fun execute() {
            val account = Account("Gabiroba", UUID.randomUUID().toString(), 100.0);
            account.deposit(200 as Double);

            println(account.balance);
        }
    }
}