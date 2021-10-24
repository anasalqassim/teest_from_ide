fun main() {

   // anonymous function without parameter and with unit (void) as required return type
   val myF1 : () -> Unit = {
     println("i am  an anonymous function without any parameter or return type ")
    }

 // anonymous function with Int as  parameter and with unit (void) as required return type
    val myF2 : (num1 : Int) -> Unit = {
     println("i am  an anonymous function with $it as parameter but without required  return type ")

    }

 // anonymous function with Int as parameter and with Int as required return type
    val myF3: (num1 : Int) -> Int = {
     println("i am  an anonymous function with $it as parameter and with Int as required return type and my return value is down there:")
    90
    }


    myF1()

    println()

    myF2(100)

    println()

    println(myF3(999))


}






