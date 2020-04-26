//本章挑戰提
import java.io.File

//引入menu
val menuList01 = File("data/tavern-menu-items.txt").readText().split("\r\n")

//解題方便,直接使用mutable
val customer01 = mutableMapOf<String, Double>("ShengYou" to 10.75, "Kate" to 8.0, "Ahdaa" to 5.5)

fun main() {

    //增加不符合標準的顧客
    customer01 += "shuan" to 0.0

    //用 foreach & if 篩選出可以接的客人
    customer01.forEach { customer01, money01 -> if (
        money01 > 0.0) {
        println("hi, $customer01 您好,歡迎光臨")

        //index為預設語法, 因為沒有用到, 所以就沒有print了
        menuList01.forEachIndexed { index, s01 ->
            println("本店的飲品及價錢如下: \n$s01") }

    }else{
        println("hi, $customer01 很抱歉,本店有低消,掰掰")
    }
    }
}