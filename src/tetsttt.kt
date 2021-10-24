fun main() {
    //print("Type the first number: ")
   // val figrst = Integer.valueOf(readLine())
   // print("Type the second number: ")
    //val second = Integer.valueOf(readLine())
 //   math(first, second)

    maximum(1,3,3)


}

val maximum:(num1:Int , num2:Int , num3:Int) -> Unit = {
        num1: Int, num2: Int, num3: Int ->
    if (num1 > num2 ){
        if(num1 >num3){
            println("the largest number is $num1")
        }else if (num3 > num1 ){
            println("the largest number is $num3")
        }
    }
    else if (num2 > num3){
        println("the largest number is $num2")
    }
    else if (num3 > num2 ) {
        println("the largest number is $num3")
    }
    else println("wrong input")
}


fun math ( num1:Int , num2:Int ) {
    print("add ")
    println(num1 + num2 )
    print("subtract ")
    println(num1 - num2 )
    print("divide ")
    println(num1 / num2 )
    print("multiply ")
    println(num1 * num2 )

}

fun max(num1:Int,num2:Int,num3:Int){
    println(maxOf(num1,num2,num3))
}