fun main() {
        //var x:Int? = null
   // val result = x?.plus(10)
   // println(result)

//    if (x != null) {
//        val result2 = x.plus(10)
//       // println(result2)
//    }else{
//        println("you dont have x")
//    }
    //val result3 = x!!.plus(10)
   // println(result3)



   // val name:String? = null

    //var theFinalName:String =""
//    if (name != null){
//       theFinalName = name
//    }else{
//       theFinalName = "the name is null"
//    }

    //theFinalName = name ?: "the name is null"
   // println(theFinalName)

    //var x:Int? = null

//    if (x == null){
//        throw NullPointerException()
//    }


//    try {
//        val num1 = Integer.valueOf(readLine())
//    }catch (e : ArithmeticException){
//        println("you hurted the math")
//    }catch (e : NullPointerException){
//        println("you missed up on the null things")
//    }catch (e: NumberFormatException){
//        println("you cant ues letters")
//    }catch (e : Exception){
//        println(e)
//    }

/*  --------------------Strings-----------------------  */

   // val myName = "anas"
       // println(myName.reversed())
    //val (name1,name2) = myName.split(" ")
   // println(name1)
   // println(name2)

   // println(" hello \n how are you  ")

    //------------------numbers---------------//

    val remaining = 8.7 / 3.41
    val formatter = "%.3f"
    println("you have ${formatter.format(remaining)}")

    val final = String.format("%.3f",remaining)
    println(final)

    println("you have ${"%.3f".format(remaining)}")



    val intStr = "99"
   // println(intStr.toInt() + 5)
    val floatStr = "99.8f"
    val ff = floatStr.toFloat()
    //println(ff)
    val doubleStr = "10"
    //println(doubleStr.toDouble())


}



