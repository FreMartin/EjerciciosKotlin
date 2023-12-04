fun main() {

    var suma:Double = 0.0
    val promedio:Double = 0.0
    var cont:Int = 0

    do {
        println("Digita un valor:")
        var valor = readLine()?.toDouble()
        if (valor != null) {
            suma += valor
            cont ++
        }else{
            println("Ingrese un valor admisible")
        }

    } while (valor?.toDouble()?.toInt() != 0)
    println("""
        Sumatoria: $suma
        Promedio: ${suma/(cont-1)}
    """.trimIndent())

}

