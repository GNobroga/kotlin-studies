package behavioral

interface Command {
    fun execute()
}

class CreateUserCommand : Command {
    override fun execute() {
        println("Creating user")
    }

}


fun main() {
    val command: Command = CreateUserCommand()
    command.execute()
}