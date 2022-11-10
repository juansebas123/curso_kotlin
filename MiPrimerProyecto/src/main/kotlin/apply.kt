fun main(args: Array<String>) {
    val moviles = mutableListOf("google pixel 2xl","google pixel 4a","huawei redmi 9","xiaomi mi a3").apply{
            removeIf { movil -> movil.contains("google") }
        }
    println(moviles)

    val colores : MutableList<String> = mutableListOf("Amarillo","Azul","Rojo")
    colores?.apply {
        println("NUestros colores son $this")
        println("la cantidad de colores es $size")
    }
}