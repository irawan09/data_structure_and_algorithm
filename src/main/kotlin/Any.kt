import kotlin.Any

class Any {
    var content: Any? = null

    fun put(content: Any?){
        this.content = content
    }

    fun retrive(): Any?{
        return  this.content
    }

    fun isEmpty(): Boolean{
        return content == null
    }
}