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

    fun nodeAt(index:Int):Node<T>?{
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index){
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    fun insertAfter(value: T, afterNode: Node<T>):Node<T>{
        if (tail == afterNode){
            appendTail(value)
            return tail!!
        }
        val newNode = Node(value, afterNode.next)
        afterNode.next = newNode
        size++
        return newNode
    }

    fun popHead(): T?{
        if (!isEmpty()) size--
        val result = head?.value
        head = head?.next

        if (isEmpty()){
            tail = null
        }
        return result
    }

    fun removeTail():T?{
        val head = head ?: return null
        if (head.next == null) return popHead()
        size--

        var prev = head
        var current = head

        var next = current.next
        while (next != null){
            prev = current
            current = next
            next = current.next
        }

        prev.next = null
        tail = prev
        return current.value
    }
}