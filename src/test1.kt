
fun main() {
   println(adding(5,5))
   println(adding("5",5))
}

fun adding(num1:Int,num2:Int):Int{
   return num1+num2
}
fun adding(num1:String,num2: Int):String{
   return num1 + num2
}

