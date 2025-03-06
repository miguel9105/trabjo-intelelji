package punto1

open class Phone(var isScreenLightOn: Boolean = false) {
    fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {
    var isFolded: Boolean = true
        private set

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }

    override fun switchOn() {
        if (!isFolded) {
            super.switchOn() // Llama al método switchOn() de la clase base (Phone)
        } else {
            println("Cannot switch on the screen when the phone is folded.")
        }
    }
}

fun main() {
    val foldablePhone = FoldablePhone()

    // Intentar encender la pantalla cuando el teléfono está plegado
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()  // La pantalla debería estar apagada

    // Desplegar el teléfono y encender la pantalla
    foldablePhone.unfold()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()  // La pantalla debería estar encendida

    // Plegar el teléfono nuevamente y verificar el estado de la pantalla
    foldablePhone.fold()
    foldablePhone.checkPhoneScreenLight()  // La pantalla debería estar apagada
}