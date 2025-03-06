package punto1

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior,
        isMonday)}.")}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
//Completa el codigo
    return when {
        age < 0 || age > 120 -> -1 // Precio no válido para edades fuera de las especificaciones
        age <= 12 -> 15 // Precio para niños
        age in 13..60 -> if (isMonday) 25 else 30 // Precio para adultos, con descuento los lunes
        else -> 20 // Precio para personas mayores
    }
}