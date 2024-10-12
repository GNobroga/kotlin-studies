package structural

interface Node {
    fun next(): Node?
    fun setNext(next: Node)
    fun getValue(): Int
}

class SingleValueNode(private val value: Int, private var next: Node? = null) : Node {
    override fun next(): Node? {
        return next
    }

    override fun setNext(next: Node) {
        this.next = next
    }

    override fun getValue(): Int {
        return value
    }
}

class DoubleValueNode(private val value: Int, private var next: Node? = null) : Node {
    override fun next(): Node? {
        return next
    }

    override fun setNext(next: Node) {
        this.next = next
    }

    override fun getValue(): Int {
        return value * 2
    }
}


fun main() {
    var node: Node? = SingleValueNode(100, DoubleValueNode(200, SingleValueNode(10)))
    while (node != null) {
        println(node.getValue())
        node = node.next()
    }
}