fun main(args: Array<String>) {
    // no puede tener elemento repetidos
    //inmutable
    val vocalesRepetidad = setOf("a","e","i","o","u","a","e","i","o","u")
    println(vocalesRepetidad)

    val numerosFavoritos = mutableListOf(1,2,3,4)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    println(numerosFavoritos)


    numerosFavoritos.remove(5) // no elimina la posicion si no le valor
    println(numerosFavoritos)

    val valorDelSet = numerosFavoritos.firstOrNull{ numero -> numero > 2 }
    println(valorDelSet)
}