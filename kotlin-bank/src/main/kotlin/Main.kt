import domain.entities.Account
import domain.entities.Bank
import domain.entities.User
import java.lang.Exception
import java.math.BigDecimal

fun main(args: Array<String>) {
    val bank = Bank.create("Nubank")
    var option: Int

    do {
        option = instructions()

        when(option) {
            1 -> {
                println("Insira o nome do usuário: ")
                val userName = readln()
                createAccount(bank, userName)
            }
            else -> break
        }
    } while(option != 0)
}

fun instructions(): Int {
   try {
       println("""
           1. Criar uma conta
           0. Sair 
           Escolha uma opção: 
        """.trimIndent())
       val option = readlnOrNull()?.toInt()
       return option as Int
   } catch (error: Exception) {
       return instructions()
   }
}

fun createAccount(bank: Bank, userName: String) {
    val user = User.create(userName)
    val account = Account.create(user, bank)
    bank.addAccount(account)
}
