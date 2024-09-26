package domain.entities

import domain.entities.Account
import domain.sequence.SequenceFactory
import domain.sequence.SequenceType

data class User(val id: Long, val name: String) {

    companion object {
        fun create(name: String): User {
            val sequence = SequenceFactory.create(SequenceType.USER)
            return User(sequence.getAndIncrement(), name)
        }
    }
}