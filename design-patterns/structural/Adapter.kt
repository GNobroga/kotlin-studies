package structural

// O adapter, faz a adaptação de uma interface para outra

interface JSONConverter {
    fun toJson(): String
}

class JSONConverterImpl : JSONConverter {
    override fun toJson(): String {
        return """
            {
                "name": "Gabriel Cardoso Girarde"
            }
        """.trimIndent()
    }

}

interface XMLJsonConverter {
    fun toXml(): String
}

class XMLJSONConvertImpl(private val jsonConverter: JSONConverter) : XMLJsonConverter {
    override fun toXml(): String {
        val json = jsonConverter.toJson()
        // Converter pra XML
        return "<? xml version='1' encoding='utf-8'?>"
    }
}
fun main() {
    val xmlJsonConverter: XMLJsonConverter = XMLJSONConvertImpl(JSONConverterImpl())
    println(xmlJsonConverter.toXml())
}