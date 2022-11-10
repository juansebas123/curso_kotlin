fun main(args: Array<String>) {
    val largoDelValorInicial = superFucion(valorInicial = "hola", block = {valor->
        valor.length
    })
    println(largoDelValorInicial)

    val lambda= funcionInception("Enrique")
    val valorLambda: String = lambda()
    println(valorLambda)
}

fun superFucion(valorInicial : String, block : (String) -> Int) : Int {
    return  block(valorInicial)
}

fun funcionInception(nombre : String) : () -> String{
    return {
        "hola desde la lambda $nombre"
    }
}