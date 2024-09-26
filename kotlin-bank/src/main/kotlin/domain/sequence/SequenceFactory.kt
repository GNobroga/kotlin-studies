package domain.sequence

import java.lang.IllegalArgumentException

object SequenceFactory {

    fun create(type: SequenceType? = null): Sequence {
        return when(type) {
            SequenceType.ACCOUNT -> AccountSequence.instance
            SequenceType.USER -> UserSequence.instance
            SequenceType.BANK -> BankSequence.instance
            else -> BankSequence.instance
        }
    }

}
