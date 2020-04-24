//Map的使用方法: to, pair

val patronGoldTo = mapOf("Eli" to 10.75, "Mordoc" to 8.0, "Sophie" to 5.5)
val patronGoldPair = mapOf(Pair("Eli", 10.75), Pair("Mordoc", 8.00), Pair("Sophie", 5.50))

fun main() {
    println(patronGoldTo)
    println(patronGoldPair)
}