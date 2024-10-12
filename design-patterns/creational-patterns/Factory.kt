package `creational-patterns`

import java.lang.IllegalArgumentException

interface Database {
    fun query(sql: String): Any
}

class PostgresDatabase : Database {
    override fun query(sql: String): Any {
        println("Postgres executing query...")
        TODO("Not yet implemented")
    }
}
class MySQLDatabase : Database {
    override fun query(sql: String): Any {
        println("Mysql executing query...")
        TODO("Not yet implemented")
    }
}

enum class DatabaseType {
    POSTGRES,
    MYSQL
}
object PostgresFactory {
    fun create(type: DatabaseType): Database {
        return when (type) {
            DatabaseType.POSTGRES -> PostgresDatabase();
            DatabaseType.MYSQL -> MySQLDatabase();
            else -> throw IllegalArgumentException()
        }
    }
}
fun main(args: Array<String>) {
    val dabatase: Database = PostgresFactory.create(DatabaseType.POSTGRES)
    dabatase.query("SELECT * FROM users WHERE id = 1")
}