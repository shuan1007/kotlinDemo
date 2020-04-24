//因為kotlin的map是read only, 要修改要用mutablemap

val MapDemo01 = mapOf("這是" to "1", "這是" to "2")
val MapDemo02 = mapOf("這是" to "1", "這不是" to "2")
val MapDemo03 = mutableMapOf("那是" to "1", "那不是" to "2")

fun main() {
    println(MapDemo01)
    println(MapDemo02)
    println(MapDemo03)

    MapDemo03 += "那不是" to "3"
    println(MapDemo03)
}