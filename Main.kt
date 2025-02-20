import java.io.File
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        interactiveMode()
    } else {
        fileMode(args[0])
    }
}

fun interactiveMode() {
    val a = readCoefficient("a")
    if (a == 0.0) {
        println("Error. a cannot be 0")
        return
    }
    val b = readCoefficient("b")
    val c = readCoefficient("c")
    solveEquation(a, b, c)
}

fun fileMode(filePath: String) {
    val file = File(filePath)
    if (!file.exists()) {
        println("file $filePath does not exist")
        exitProcess(1)
    }

    val content = file.readText().trim()
    val parts = content.split(" ")
    if (parts.size != 3) {
        println("invalid file format")
        exitProcess(1)
    }

    val a = parts[0].toDoubleOrNull()
    val b = parts[1].toDoubleOrNull()
    val c = parts[2].toDoubleOrNull()

    if (a == null || b == null || c == null) {
        println("invalid file format")
        exitProcess(1)
    }
    if (a == 0.0) {
        println("Error. a cannot be 0")
        exitProcess(1)
    }

    solveEquation(a, b, c)
}

fun readCoefficient(name: String): Double {
    while (true) {
        print("$name = ")
        val input = readLine()
        val number = input?.toDoubleOrNull()
        if (number != null) return number
        println("Error. Expected a valid real number, got $input instead")
    }
}

fun solveEquation(a: Double, b: Double, c: Double) {
    println("Equation is: ($a) x^2 + ($b) x + ($c) = 0")
    val discriminant = b * b - 4 * a * c
    when {
        discriminant > 0 -> {
            val x1 = (-b - Math.sqrt(discriminant)) / (2 * a)
            val x2 = (-b + Math.sqrt(discriminant)) / (2 * a)
            println("There are 2 roots")
            println("x1 = $x1")
            println("x2 = $x2")
        }
        discriminant == 0.0 -> {
            val x = -b / (2 * a)
            println("There are 1 roots")
            println("x1 = $x")
        }
        else -> println("There are 0 roots")
    }
}
