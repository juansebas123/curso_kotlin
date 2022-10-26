fun main(args: Array<String>) {
    val edadDeSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99 //ejemplo: clave=capitan america valores=99
    )
    println(edadDeSuperHeroes)

    val edadSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable.put("Wolverine",45)
    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable["storm"] = 30
    println(edadSuperHeroesMutable)

    val edadIronman = edadSuperHeroesMutable["Ironman"]
    println(edadIronman)

    //elimiar de maps
    edadSuperHeroesMutable.remove("Wolverine")
    println(edadSuperHeroesMutable)

    println(edadSuperHeroesMutable.keys) //devuelve las claves
    println(edadSuperHeroesMutable.values) // devuelve valores

}