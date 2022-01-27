import LinkedList.LinkedList

fun main(args: Array<String>) {

//    val box = Generics()
//    box.put(13456)
//    println(box.retrive())
//    box.put("Hello")
//    println(box.retrive())
//
//    val intBox = GenericsAbstract<Int>()
//    intBox.put(12344)
//    println(intBox.retrieve())
//
//    val stringBox = GenericsAbstract<String>()
//    stringBox.put("Hello")
//    println(stringBox.retrieve())
//
//    val dynamicArrayList = DynamicArrayList<String>(100)
//    println("Size of newly created vector is : ${dynamicArrayList.size()}")
//    println("Elements in vector are : $dynamicArrayList")
//
//    val companies = arrayListOf<String>("Google", "Microsoft", "Facebook", "Apple",
//        "JetBrains")
//
//    companies.add("Samsung")
//    println(companies)
//    companies.set(2, "Twitter")
//    println(companies)
//    companies[2] = "LinkedIn"
//    println(companies)
//
//    val days = listOf("Sunday","Monday", "Tuesday", "Wednesday")
//    val month = arrayListOf("January", "February","March", "April")
//
//    val modifiedDays = days + "Thursday"
//    println(modifiedDays)
//    month.add("May")
//    print(month)

//    val node1 = Node(1)
//    val node2 = Node(2)
//    val node3 = Node(4)
//    val node4 = Node(6)
//    val node5 = Node(0)
//
//    node1.next = node2
//    node2.next = node3
//    node3.next = node4
//    node4.next = node5
//
//    println(node1)

    val list = LinkedList<String>()
    list.pushHead("Ary")
    list.pushHead("Irawan")
    list.pushHead("Chaos")
    list.pushHead("Freedom")
    list.pushHead("Increment")
    println(list)

    list.pushHead("Hello").pushHead("MyName").pushHead("is").pushHead("Ary")
    println(list)

    list.appendTail("Apple")
    list.appendTail("Orange")
    println(list)
}