package punto1

fun main () {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
// Completa el código
    if (numberOfMessages == 51) {
        println("you have $numberOfMessages notifications")
    }
    else{
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}