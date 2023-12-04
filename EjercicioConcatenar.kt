/*
1. Crear un programa que solicite al usuario los datos de su dirección, pidiendo el nombre
de la calle, la ciudad, el estado o provincia, el país y el código postal. Imprimir en consola la
dirección del usuario concatenada en una sola línea y separada por comas.
 */

fun main() {
    ingresarDatos()
}

fun ingresarDatos(){

    println("Calle: ")
    val calle: String= readlnOrNull().toString()
    println("Ciudad: ")
    val ciudad: String= readlnOrNull().toString()
    println("Provincia: ")
    val prov: String= readlnOrNull().toString()
    println("Pais: ")
    val pais: String= readlnOrNull().toString()
    println("Codigo Postal: ")
    val postal: String= readlnOrNull().toString()
    concatenar(calle, ciudad, prov, pais, postal)
}

fun concatenar(calle:String, ciudad:String, prov:String, pais:String, postal:String){
    val cadena = "$calle, $ciudad, $prov, $pais, $postal"
    println(cadena)
}