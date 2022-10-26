fun main(args: Array<String>) {
    //listas mutables y inmutables
    // inmutables: no puede tener elementos mofificados, ni eliminarlos y modificarlos
    val listaDeNombres = listOf("juan", "Enrique", "camila") //lista de tipo string
    println(listaDeNombres)
    //mutable
    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    //agregar datos
    listaVacia.add("juan")
    println(listaVacia)

    //obtener el valos de la lista
    val valorUsandoGet = listaVacia.get(0)
    println(valorUsandoGet)

    val valorUsandoOperdaor = listaVacia[0]
    println(valorUsandoOperdaor)

    val primerValor: String? = listaDeNombres.firstOrNull() //obtener priemr valor y devolverlo
    println(primerValor)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)

    listaVacia.removeIf { caracteres -> caracteres.length > 3 } //remueve solo cuando la condicion entre los llaves sea verdadera
    println(listaVacia)

    //arrays lista de datos agrupados
    val myArray = arrayOf(1,2,3,4)
    println("nuestro array $myArray") //estructa de datos basica, codigo en otro idioma
    println("array como listas ${myArray.toList()}")

}