package domain.entities

import domain.sequence.SequenceFactory
import domain.sequence.SequenceType
import java.lang.IllegalArgumentException
import java.math.BigDecimal

class Account(val id: Long, val user: User, val bank: Bank, balance: BigDecimal = BigDecimal.ZERO) {

    var balance = balance
        set(value) {
            if (value < BigDecimal.ZERO) {
                throw IllegalArgumentException("O saldo não pode ser negativo")
            }
            field = value
        }

    companion object {
        fun create(user: User, bank: Bank, balance: BigDecimal = BigDecimal.ZERO): Account {
            val sequence = SequenceFactory.create(SequenceType.ACCOUNT)
            return Account(sequence.getAndIncrement(), user, bank, balance)
        }
    }
}