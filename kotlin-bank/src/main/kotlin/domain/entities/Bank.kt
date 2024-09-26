package domain.entities

import domain.sequence.SequenceFactory
import domain.sequence.SequenceType
import java.lang.IllegalArgumentException
import java.math.BigDecimal
import java.util.*

class Bank(val id: Long, val name: String) {

    private val _accounts: MutableList<Account> = mutableListOf()

    val accounts get() = _accounts.toList()

    fun addAccount(account: Account) {
        if (_accounts.find { it.id == account.id && it.bank.id == id } != null) {
            throw IllegalArgumentException("A conta já está cadastrada.")
        }
        _accounts.add(account)
    }

    private fun getAccountById(accountId: Long): Account {
        val account = _accounts.firstOrNull { it.id == accountId }
        if (Objects.isNull(account)) {
            throw IllegalArgumentException("Conta com $accountId não encontrada!")
        }
        return account!!;
    }


    fun withdraw(accountId: Long, value: BigDecimal) {
        if (value <= BigDecimal.ZERO) {
            throw IllegalArgumentException("Para transferir é necessário inserir um valor positivo")
        }
        val account = getAccountById(accountId);
        account.balance -= value;
    }

    fun deposit(accountId: Long, value: BigDecimal) {
        if (value <= BigDecimal.ZERO) {
            throw IllegalArgumentException("Para transferir é necessário inserir um valor positivo")
        }
        val account = getAccountById(accountId);
        account.balance += value;
    }

    fun transfer(fromAccountId: Long, toAccountId: Long, value: BigDecimal) {
        if (value <= BigDecimal.ZERO) {
            throw IllegalArgumentException("Para transferir é necessário inserir um valor positivo")
        }

        val fromAccount = getAccountById(fromAccountId);
        val toAccount = getAccountById(toAccountId);

        if (fromAccount.user.id == toAccountId) {
            throw IllegalArgumentException("Não é possível transferir para sí mesmo")
        }

        if (fromAccount.balance > BigDecimal.ZERO && fromAccount.balance >= value) {
            fromAccount.balance -= value;
            toAccount.balance += value;
        } else {
            throw IllegalArgumentException("Saldo insuficiente!")
        }
    }

    companion object {
        fun create(name: String): Bank {
            val sequence = SequenceFactory.create()
            return Bank(sequence.getAndIncrement(), name)
        }
    }
}