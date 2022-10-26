fun main(args: Array<String>) {
    var nombre : String? = null
    // println(nombre?.length) no queremos que ejecute estos tipos de errores de ?
    try {
        //gestionar los errores simularlo
        // nombre!!.length
        throw NullPointerException ("referencia nula")
    } catch (exepcion : NullPointerException){
        println("ha ocurrido un error")
    } finally {
        println("Finalmente ha ocurrido un error.. cerrano aplicacion")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try { primerValor / segundoValor } catch (exception : Exception) {0}
    println(resultado)
}