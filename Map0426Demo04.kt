//個別取值

val patronGoldPair01 = mapOf(Pair("Eli", 10.75), Pair("Mordoc", 8.00), Pair("Sophie", 5.50))

fun main() {
    println(patronGoldPair01["Eli"])
    println(patronGoldPair01["Mordoc"])
    println(patronGoldPair01["Sophie"])
}