package domain.sequence

class BankSequence : Sequence {

    companion object {
        var currentSequence = 1L
        val instance = BankSequence()
    }
    override fun getAndIncrement(): Long {
        var oldCurrentSequence = currentSequence
        currentSequence++
        return oldCurrentSequence
    }

}