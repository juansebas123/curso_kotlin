fun main(args: Array<String>){
    //for: ciclo for permite ejecutar un codigo para cada elemento de lista que creamos
    val listaDeFrutas = listOf("Manzana", "Pera", "Frambuesa","Durazno") //list0ftodo lo que agreguemos va a una lista
    for (fruta in listaDeFrutas) println("hoy voy a comerme una fruta llamada $fruta")
    listaDeFrutas.forEach{ fruta-> println("hoy voy a comerme una fruta nueva se llama $fruta") } // {}=funcion anonima ejecuta una cantidad n
    //forEach es lo mismo que: for (fruta in listaDeFrutas)

    //funcion map:
    val caracteresDeFruta: List<Int> = listaDeFrutas.map { fruta -> fruta.length } //fruta -> lo convierte a
    println(caracteresDeFruta)

    //funcion filter filtras elementos de una función
    val listaFiltrada = caracteresDeFruta.filter { largoDeFrutas -> largoDeFrutas > 5 }
    println(listaFiltrada)
}
