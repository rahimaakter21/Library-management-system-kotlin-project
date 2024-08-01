package Nestedclass

class Outer {

    var name:String="musfiq"
    class nested{
        var outer=Outer()
        fun display(){
            println(outer.name)
        }

    }
}
fun main(){

    val out= Outer()
    val nested=Outer.nested()
    nested.display()

}