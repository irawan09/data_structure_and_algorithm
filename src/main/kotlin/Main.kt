fun main(args: Array<String>) {

    var box = Any()
    box.put(13456)
    println(box.retrive())
    box.put("Hello")
    println(box.retrive())

    val dynamicArrayList = DynamicArrayList<String>(100)
    println("Size of newly created vector is : ${dynamicArrayList.size()}")
    println("Elements in vector are : $dynamicArrayList")

    val companies = arrayListOf<String>("Google", "Microsoft", "Facebook", "Apple",
        "JetBrains")

    companies.add("Samsung")
    println(companies)
    companies.set(2, "Twitter")
    println(companies)
    companies[2] = "LinkedIn"
    println(companies)

    val days = listOf("Sunday","Monday", "Tuesday", "Wednesday")
    val month = arrayListOf("January", "February","March", "April")

    val modifiedDays = days + "Thursday"
    println(modifiedDays)
    month.add("May")
    print(month)

}