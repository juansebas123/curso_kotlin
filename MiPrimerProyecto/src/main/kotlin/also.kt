fun main(args: Array<String>) {
    val moviles = mutableListOf("google pixel 2xl","google pixel 4a","huawei redmi 9","xiaomi mi a3").also{
        lista -> println("el valor original de la lista es $lista")
        }.asReversed()
    println(moviles)
}