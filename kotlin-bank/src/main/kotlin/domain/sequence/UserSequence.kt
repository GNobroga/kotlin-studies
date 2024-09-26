package domain.sequence

class UserSequence : Sequence {

    companion object {
        var currentSequence = 1L
        val instance = UserSequence()
    }
    override fun getAndIncrement(): Long {
        var oldCurrentSequence = currentSequence
        currentSequence++
        return oldCurrentSequence
    }
}