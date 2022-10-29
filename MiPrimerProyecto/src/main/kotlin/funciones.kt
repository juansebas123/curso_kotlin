fun main(args: Array<String>) {
    val fraseAleatoria ="yo nunca paro de aprender"
    println(randomCase(fraseAleatoria))
    println(imprimirFrase(fraseAleatoria))
    imprimirFrase(randomCase(fraseAleatoria))
    val fraseAleatoria2 ="yo nunca paro de aprender".randomCase2()
    imprimirFrase(fraseAleatoria2)
}
//para funciones se debe declarar afuera del main
fun randomCase(frase : String) : String {val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0){
        frase.uppercase()
    } else {
        frase.lowercase()
    }
}
//funcion tipo unit
fun imprimirFrase(frase : String) : Unit {
    println("tu frase es : $frase")
}
//funciones de extension, mas utilizados por los progrmadores
fun String.randomCase2() : String {
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0) {
        this.uppercase()//this significa que esta utilizando e string para llamar a la funcion ramdocase
    } else {
        this.lowercase()
    }
}
