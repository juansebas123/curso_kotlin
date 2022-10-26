fun main(args: Array<String>) {
    val numeroDeLoteria = listOf(11,22,43,56,78,66)

    val numerosSorted = numeroDeLoteria.sorted()
    println(numerosSorted)

    //otra forma de ordenalas automaticamente
    val numerosDELoteriaDescendientes = numeroDeLoteria.sortedDescending()
    println(numerosDELoteriaDescendientes)

    //ordenar dependiendo una condicion
    val ordenarPOrMultiplos = numeroDeLoteria.sortedBy { numero -> numero < 50 } // numeros mayores de 50 de primero y despues los menores
    println(ordenarPOrMultiplos)

    //otra
    val numerosAleatorios = numeroDeLoteria.shuffled()
    println(numerosAleatorios)

    //ordenar atras hacia adelante
    val numeroEnReversa = numeroDeLoteria.reversed()
    println(numeroEnReversa)

    //con programacion funcional (map)
    val mensajeDeNumeros = numeroDeLoteria.map { numero -> "tu numero de loteria es $numero"}
    println(mensajeDeNumeros)

    //funcion filter
    val numeroFiltrados = numeroDeLoteria.filter { numero -> numero > 50 }
    println(numeroFiltrados)

}