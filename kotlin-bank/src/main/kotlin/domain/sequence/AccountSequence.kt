package domain.sequence

class AccountSequence : Sequence {

    companion object {
        var currentSequence = 1L
        val instance = AccountSequence()
    }
    override fun getAndIncrement(): Long {
        var oldCurrentSequence = currentSequence
        currentSequence++
        return oldCurrentSequence
    }
}