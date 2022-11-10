fun main(args: Array<String>) {
    val colores = listOf("Azul", "Amarillo", "rojo")
    with(colores){
        println("nuestros colores son $this")
        println(" esta lista tiene una cantidad de colores de $size")
    }
}