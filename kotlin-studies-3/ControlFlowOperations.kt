
fun main() {

    val yourName = readlnOrNull()

    val uppercaseName = yourName?.let { it.toUpperCase() } ?: "Gabiroba"

    // With when block
    var fullName = when(uppercaseName) {
        "Gabiroba" -> "Gabriel Cardoso Girarde"
        else -> "Unknown"
    }

    // With if block

    fullName = if (uppercaseName == "Gabiroba") {
        "Gabriel Cardoso Girarde"
    } else {
        "Unknown"
    }

    // Inline if
    fullName = if (uppercaseName == "Gabiroba") "Pedro" else "José"

}