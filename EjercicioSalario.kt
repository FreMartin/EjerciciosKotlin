import java.text.DecimalFormat

/*
Crear un programa que solicite al usuario su salario mensual bruto y el porcentaje de
impuestos que debe pagar por mes, imprimir en consola cuál será su salario neto (al mes y
al año) y cuánto dinero debe pagar de impuestos (al mes y al año). Mostrar los datos de
salida con un máximo de dos posiciones decimales.
*/
fun main() {
    println("Ingrese su salario mensual")
    val salario = readlnOrNull().toString().toFloat()
    println("Ingrese el porcentaje de impuesto")
    val impuesto = readlnOrNull().toString().toDouble()
    neto(salario, impuesto)

}

fun neto(salario:Float, impuesto:Double){
    val porc = impuesto / 100
    val desc = salario * porc
    val salNeto = salario - desc
    val salAnual = salNeto * 12
    val descAnual = desc * 12
    println("""
    	El salario neto mensual es: $${DecimalFormat("#.##").format(salNeto)} 
        Luego de pagar el ${DecimalFormat("#.##").format(impuesto)}% que equivale a: $${DecimalFormat("#.##").format(desc)} 
        El salario neto anual es: $${DecimalFormat("#.##").format(salAnual)} 
        Luego de pagar el ${DecimalFormat("#.##").format(impuesto)}% por mes que equivale a: $${DecimalFormat("#.##").format(descAnual)} 
    """.trimIndent())

}