package punto1

fun main() {
    // Conversión de Celsius a Fahrenheit
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { celsius ->
        (9.0 / 5.0) * celsius + 32
    }

    // Conversión de Kelvin a Celsius
    printFinalTemperature(350.0, "Kelvin", "Celsius") { kelvin ->
        kelvin - 273.15
    }

    // Conversión de Fahrenheit a Kelvin
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { fahrenheit ->
        (5.0 / 9.0) * (fahrenheit - 32) + 273.15
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // dos decimales
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}