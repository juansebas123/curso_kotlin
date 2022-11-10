fun main(args: Array<String>) {
    // es un codigo que no esta ejecutando, pero cuando se ejecuta hay un valor
    //it.length
    val myLambda : (String) -> Int = { valor -> valor.length }
    val lambdaEjecutada: Int = myLambda("holap Platzi")
    println(lambdaEjecutada)

    val saludos = listOf("hello","hola","ciao")
    val longitudDeSaludos = saludos.map(myLambda) // los mismo: valor->valor.length
    println(longitudDeSaludos)
}