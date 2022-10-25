fun main(args: Array<String>) {
    var contador = 10
    while (contador > 0){
        println("el valor de ocntador es $contador ")
        contador--
    }

    do {
        println()
        println("generando numero aleatorio..")
        val numeroAleatorio = (0..100).random()
        println("el numero generado es $numeroAleatorio")
    } while (numeroAleatorio > 50)

}
