fun main() {

    class Tarea(val numero: Int, val actividad: String, val tiempo: Int)

    val tareas = mutableListOf<Tarea>()

    do {
        println("Selecciona una opción:")
        println("1. Ingresar tarea")
        println("2. Mostrar tareas")
        println("3. Salir")

        when (readLine()?.toIntOrNull()) {
            1 -> {

                val numero = tareas.size + 1

                println("Ingrese la actividad:")
                val actividad = readLine() ?: continue

                println("Ingrese el tiempo en minutos de la tarea:")
                val tiempo = readLine()?.toIntOrNull() ?: continue

                val nuevaTarea = Tarea(numero, actividad, tiempo)
                tareas.add(nuevaTarea)
                println("Tarea ingresada correctamente.")
            }
            2 -> {
                if (tareas.isEmpty()) {
                    println("No hay tareas registradas.")
                } else {
                    println("Tareas: ")
                    tareas.forEach { println(it) }
                }
            }
            3 -> {
                println("Saliendo del programa. ¡Hasta luego!")
                break
            }
            else -> println("Opción no válida. Por favor, elige nuevamente.")
        }
    } while (true)

}


