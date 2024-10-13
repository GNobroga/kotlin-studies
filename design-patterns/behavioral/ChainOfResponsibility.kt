package behavioral

import java.lang.IllegalArgumentException

// Cadeia de responsabilidade tem a ideia de ir passando algo por uma cadeia

interface Validator {
    fun validate(value: Int)
    fun setNext(next: Validator?)
}

class IntLessThenZeroValidator(private var next: Validator? = null) : Validator {

    override fun validate(value: Int) {
        if (value < 0) {
            throw IllegalArgumentException("Value cannot be less then zero")
        }
        next?.validate(value)
    }

    override fun setNext(next: Validator?) {
        this.next = next
    }
}

class IntGreatherThenFiftyValidator(private var next: Validator? = null) : Validator {

    override fun validate(value: Int) {
        if (value > 50) {
            throw IllegalArgumentException("Value cannot be greather then fifty")
        }
        next?.validate(value)
    }

    override fun setNext(next: Validator?) {
        this.next = next
    }
}

fun main() {
    val value = 5
    val validators = mutableListOf<Validator>(
        IntLessThenZeroValidator(),
        IntGreatherThenFiftyValidator()
    )

    val validator: Validator = validators[0]

    for (i in 0 until validators.size step 2) {
        val targetIndex = i + 1
        if (targetIndex >= validators.size) {
            continue
        }
        validators[i].setNext(validators[targetIndex])
    }

    validator.validate(value)

}