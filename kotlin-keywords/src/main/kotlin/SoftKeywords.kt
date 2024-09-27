import java.lang.IllegalArgumentException
import java.util.*
import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

//class NonEmptyStringDelegate(val callback: (Int) -> Any?) : ReadWriteProperty<Any?, String> {
//
//    private var value = ""
//    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        return value
//    }
//
//    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
//        if (value.length > 4) {
//            throw IllegalArgumentException("A string não pode ser maior que 4")
//        }
//
//        this.value = value
//    }
//
//}

// o by permite delegar comportamento para outro objeto






class MonitorProperty<T>(val callback: (T?, T?) -> Unit): ReadWriteProperty<Any, T?> {

    private var value: T? = null

    override fun getValue(thisRef: Any, property: KProperty<*>): T? {
       return this.value
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T?) {
        callback(this.value, value)
        this.value = value
    }

}


fun <T> getPropertyFromMap(map: Map<String, Any>): ReadWriteProperty<Any?, T> {
    return object : ReadWriteProperty<Any?, T> {

        private var value: T? = null

        override fun getValue(thisRef: Any?, property: KProperty<*>): T {
            if (Objects.isNull(value) && map.containsKey(property.name)) {
                return map[property.name] as T
            } else {
                return value as T
            }
        }

        override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
           this.value = value
        }

    }
}

class SomeClass(map: Map<String, Any>) {
    var name: String by getPropertyFromMap(map);
    var age: Int? by MonitorProperty {
        oldValue, newValue ->
        run {
            println("OldValue $oldValue newValue $newValue")
        }
    }
}

fun main(vararg args: String) {
    val someClass = SomeClass(mapOf("name" to "Gabriel Cardoso Girarde"))
    println(someClass.name)
    someClass.age = 100
    someClass.age = 200
}