fun main(args: Array<String>) {

    //val boolean : Boolean = true
    val boolean = true
    // long
    val numeroLargo = 3L
    // flotantes
    val double = 2.7182
    // float
    val float = 1.1f

    val primerValor = 30
    // el punto. le da superpoderes que peudes ver y hacer lo que necesite
    //primerValor.and()
    val segundoValor = 10
    val tercerValor = primerValor.minus(segundoValor)
    println(tercerValor)
    val tercerValor2 = primerValor - segundoValor
    println(tercerValor2)

    val apellido = "ricaurte"
    val sebas = "sebas"
    //val nombreCompreto = giuseppe + " " + apellido
    val nombreCompreto = "$sebas $apellido"
    println(nombreCompreto)
    val nombreCompleto2 = "Mi nombre es $sebas $apellido "
    println(nombreCompleto2)
}