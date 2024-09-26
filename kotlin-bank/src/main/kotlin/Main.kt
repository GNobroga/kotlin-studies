import domain.entities.Account
import domain.entities.Bank
import domain.entities.User
import java.lang.Exception
import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {
    val bank = Bank.create("Nubank")
    var account: Account? = null
    var option: Int

    do {
        option = instructions()

        if (Objects.isNull(account)) {
            option = 1
        }
        try {
            when(option) {
                1 -> {
                    println("Insira o nome do usuário: ")
                    val userName = readln()
                    if (Objects.isNull(account)) {
                        account = createAccount(bank, userName)
                    } else {
                        createAccount(bank, userName)
                    }
                }
                2 -> {
                    println("Insira o valor que deseja transferir: ")
                    val value = BigDecimal.valueOf(readln().toDouble())
                    println("Insira a identificação da conta que deseja transferir: ")
                    val toAccountId = readln().toLong()
                    bank.transfer(account!!.id, toAccountId, value)
                }
                3 -> {
                    println("Insira o valor que deseja depositar: ")
                    val value = BigDecimal.valueOf(readln().toDouble())
                    bank.deposit(account!!.id, value)
                }
                4 -> {
                    println("Lista de contas")
                    bank.accounts.forEach {
                        val you =  if (it.id == account!!.id) "(Você)" else ""
                        println("Identificação: ${it.id} Usuário: ${it.user.name} Saldo: ${it.balance} $you")
                    }
                }
                0 -> break
                else -> println("Opção inválida")
            }
        } catch (error: Exception) {
            println(error.message)
        }
    } while(option != 0)
}

fun instructions(): Int {
   try {
       println("""
           1. Criar uma conta
           2. Realizar Transferência
           3. Depositar
           4. Listar contas
           0. Sair 
           Escolha uma opção: 
        """.trimIndent())
       val option = readlnOrNull()?.toInt()
       return option as Int
   } catch (error: Exception) {
       return instructions()
   }
}

fun createAccount(bank: Bank, userName: String): Account {
    val user = User.create(userName)
    val account = Account.create(user, bank)
    bank.addAccount(account)
    return account
}
