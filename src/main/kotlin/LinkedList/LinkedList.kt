package LinkedList

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    var size =0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        if (isEmpty()){
            return "Empty List"
        } else{
            return head.toString()
        }
    }

    fun pushHead(value: T): LinkedList<T> {
        head = Node(value, head)
        if (tail == null){
            tail = head
        }
        size++
        return this
    }

    fun appendTail(value: T){
        if (isEmpty()){
            pushHead(value)
            return
        }
        tail?.next = Node(value)
        tail = tail?.next
        size++
    }
}