fun main(args: Array<String>) {
    imprimirNombre(nombre = "Juan Sebastián", apellido = "Ricaurte González")
    imprimirNombre2(nombre = "Juan", segundoNombre = "Sebastian", apellido = "Ricaurte González")
}

fun imprimirNombre(nombre: String, apellido : String){
    println("Mi nombre es $nombre y mis apellidso es $apellido")
}

//parametros por defecto
fun imprimirNombre2(nombre: String, segundoNombre: String = "", apellido : String) { //"si no tiene otro nombre se asigna vacio
    println("Mi nombre completo es $nombre $segundoNombre $apellido ")
}