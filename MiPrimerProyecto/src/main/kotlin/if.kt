fun main(args: Array<String>) {
    val nombre = "li"
    val nombre2 = ""

    //codicion, isNotEmpty esta funcion n osayuda indetemina si esta vacio o no, un boleano
    if (nombre.isNotEmpty()) {
        println("1.El Largo de nuestro variable nombre es ${nombre.length}") //length propiedad indica el latgo de nombre
    } else {
        println("Error, la variable esta vacia")
    }
    //tambien puede reducir a una sola linea
    if (nombre2.isNotEmpty()) println("El Largo de nuestro variable nombre es ${nombre2.length}") else println("2.Error, la variable esta vacia")

    val mensaje: String = if (nombre.length > 4) {
        "tu nombre es largo"
    } else if (nombre.isEmpty()) { // la cadena es igual a cero
        "Nombre esta vacio"
    } else {
        "tienes un nombre corto"
    }
    println(mensaje)
}