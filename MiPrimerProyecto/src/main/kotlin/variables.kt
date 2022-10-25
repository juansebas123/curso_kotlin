//const es una variante de las variables de solo lectura, estas se definen fuera de la función y se escriben con la palabra
//reservada const seguida de la palabra reservada val, este tipo de variables son usada para valores que nunca cambian.
const val PI = 3.1416
fun main(args: Array<String>) {
    println("Hello World!")
    // var: Son variables de lectura y escritura, estas variables el
    //valor puede cambiarse
    //variabele dinero que tiene unalor asignado de 10
    //var dinero : Int = 10
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)
    // val: Son variables de solo lectura, dichas variables una vez
    //asignado el valor no puede ser cambiado posteriormente.
    val nombre = "Maria"
    println(nombre)
    println(PI)
}
