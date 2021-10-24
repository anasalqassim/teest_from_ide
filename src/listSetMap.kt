fun main() {

    //val names = listOf("ahmed", "khaled", "rakan")

//     val x = names.getOrElse(3){
//         "you dont have index number $it"
//     }
//    println(x)

    val numbers = listOf(22,18,25)

    val y = numbers.getOrNull(4)
  //  println(y)

//    val nums  = mutableListOf(15,90,10)
//    println(nums)
//    nums.add(1,99)
//    println(nums)
    val names = mutableListOf("anas","khaled", "ahmed")
    names.add(1,"rakan")
    //println(names)
    names.add(2,"mohmmed")
   // println(names)

    val doubles = mutableListOf(10.5,5.9,4.8)
//    println(doubles)
//   doubles[0] = 14.4
//    println(doubles)

    val cars= mutableListOf<String>("car1","car2","car3","car4")

    //println(cars)
    //cars.uyjgjgremove("car3")
    //cars -= "car3"hfg
   // println(cars)


//    cars.removeAt(2)
//    println(cars)


        val stations = mutableListOf("water", "food", "juice" , "water")

//        stations.forEach {
//            println(it + " hi")
//        }

//    stations.forEachIndexed { index, s ->
//        stations[index] = "$s hi"
//    }
//        println(stations)

        //----------------Set-----------//

//        val ids = setOf(100,200,300)
//        println(ids)

//        val ids1 = mutableSetOf(1,2,3)
//        ids1.add(4)
//        println(ids1)
//        ids1.remove(4)
//        println(ids1)


//        ids1.forEach {
//
//        }


//        val namess  = mutableListOf(1,2,3,3).distinct()
//        println(namess)


        val xx = mutableMapOf<Int?,String?>(1111111 to "ahmed", 2222222 to "aaaa")
        println(xx)
        xx.put(48635,"kdhgfskdjf")
        println(xx.get(1111111))




}