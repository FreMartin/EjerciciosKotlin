import java.text.DecimalFormat
import kotlin.math.pow

/*
Crear un programa que calcule al área y el perímetro o circunferencia de un círculo, en
base a lo siguiente:
 El usuario debe ingresar solo el radio del círculo en centímetros.
 El cálculo de los valores debe realizarse en funciones, una para el área y otra para la
circunferencia.
 Imprimir el resultado (área y circunferencia) en centímetros y en pulgadas con el
mismo formato que se muestra en el ejemplo y con un máximo de dos posiciones
decimales
 */

fun main() {
    val pi:Double = 3.14
    println("Ingreses el radio de la circunferencia en centimetros")
    val radio:Double = readlnOrNull().toString().toDouble()
    val area = area(radio, pi)
    val perimetro = perimetro(radio, pi)
    mostrar(area, perimetro)
}

fun area(radio: Double, pi: Double): Double {
    return pi * (radio.toDouble().pow(2.0))
}

fun perimetro(radio: Double, pi: Double): Double {
    return (2 * pi) * radio
}

fun mostrar(area:Double, perimetro:Double){
    println("""
        ***Centimetros***
        Area       | ${DecimalFormat("#.##").format(area)} cm
        Perimetro  | ${DecimalFormat("#.##").format(perimetro)} cm
        
        ***Pulgadas***
        Area       | ${DecimalFormat("#.##").format(area.toDouble()/2.54)} in
        Perimetro  | ${DecimalFormat("#.##").format(perimetro.toDouble()/2.54)} in
    """.trimIndent())
}