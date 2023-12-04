fun main() {
    // Solicitar al vendedor que ingrese los kilómetros del trayecto
    println("Ingrese los kilómetros del trayecto:")
    val kms = readLine()?.toDoubleOrNull()

    if (kms == null || kms <= 0) {
        println("Por favor, ingrese una cantidad válida de kilómetros.")
        return
    }

    // Solicitar al vendedor que indique si se aplica el descuento
    println("¿Se aplica el descuento a personas de la tercera edad? (si/1 para aplicar descuento, cualquier otra cosa para no aplicar):")
    val aplicarDesc = readLine()?.toLowerCase()

    // Calcular el costo total
    val costoBase = 2.25 * kms
    val costoTotal = if (aplicarDesc == "si" || aplicarDesc == "1") {
        val discount = 0.45
        val discountedAmount = costoBase * discount
        costoBase - discountedAmount
    } else {
        costoBase
    }

    // Imprimir el total redondeado en números enteros
    val totalRedond = costoTotal.toInt()
    println("Total a cobrar: $$totalRedond")

}