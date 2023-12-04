fun main() {

    var alumnos = arrayOf("José", "Alberto", "Laura", "Noel", "Erika", "Daniel")
    var notas = arrayOf("31.0","94.0","98.5","75.0","46.5", "75.0")
    promedio(notas)
    baja(alumnos, notas)
    alta(alumnos, notas)
    reprobado(alumnos, notas)
}

fun promedio(notas: Array<String>){
    var suma:Double = 0.0
    for( i in  0 until notas.size){
        suma = suma + (notas[i].toDouble())
    }
    println("El promedio es: ${suma/6}")
}

fun baja(alumnos:Array<String>, notas: Array<String>){
    var min:Double = 100.0
    var alBajo:String = ""
    for( i in  0 until notas.size) {
        if ((notas[i].toDouble()) < min){
            min = (notas[i].toDouble())
            alBajo = (alumnos[i])
        }
    }
    println("La nota mas baja es: $min y corresponde a $alBajo")
}

fun alta(alumnos:Array<String>, notas: Array<String>){
    var max:Double = 0.0
    var alAlto:String = ""
    for( i in  0 until notas.size) {
        if ((notas[i].toDouble()) > max){
            max = (notas[i].toDouble())
            alAlto = (alumnos[i])
        }
    }
    println("La nota mas alta es: $max y corresponde a $alAlto")
}

fun reprobado(alumnos:Array<String>, notas: Array<String>){
    println("Alumnos reprobados: ")
    for( i in  0 until notas.size) {
        if ((notas[i].toDouble()) < 60){
            println("Alumno: ${alumnos[i]}, nota: ${notas[i]}")
        }
    }

}

