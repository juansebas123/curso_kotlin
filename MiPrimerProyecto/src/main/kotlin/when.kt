fun main(args: Array<String>) {
    val nombreColor = "CArmesi"

    when (nombreColor) {
        "Amarillo" -> println("Amarillo color de la alegria")
        "Rojo", "CArmesi" -> println("El color simoliza el calor")
        else -> println("Error. No tengo informacion del color")
    }

    val code = 501
    when (code) {
        in 200..299 -> println("todo ha ido bien")// in =se encuentra en
        in 400..500 -> println("algo ha fallado")
        else -> println("codigo desconocido, algo ha fallado")
    }

    val tallaDeZapatos = 41
    val mensaje = when (tallaDeZapatos) {
        41, 43 -> "tenemos disponibles"
        42, 44 -> "casi no nos queda"
        45 -> "lo siento, no tenemos disponiblidad"
        else -> "estos zapatos solo viene solo tallas de 41 a 45"
    }
    println(mensaje)
}