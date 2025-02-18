import kotlin.system.exitProcess

// Datos simulados de cuentas (Número de tarjeta -> (PIN, Saldo))
val accounts = mutableMapOf(
    "4539148803436467" to Pair("1234", 1500.0),
    "6011514433546201" to Pair("5678", 2500.0)
)

/**
 * Verifica si un número de tarjeta es válido según el algoritmo de Luhn.
 */
fun isValidLuhn(number: String): Boolean {
    val sanitizedNumber = number.replace(" ", "").takeIf { it.all { char -> char.isDigit() } }
        ?: return false

    val sum = sanitizedNumber.reversed()
        .mapIndexed { index, char ->
            val digit = char.digitToInt()
            if (index % 2 == 1) {
                val doubled = digit * 2
                if (doubled > 9) doubled - 9 else doubled
            } else {
                digit
            }
        }.sum()

    return sum % 10 == 0
}

/**
 * Función para manejar operaciones del cajero automático.
 */
fun atmOperations(cardNumber: String) {
    val account = accounts[cardNumber]
    if (account == null) {
        println("❌ Tarjeta no registrada en el sistema.")
        return
    }

    print("Ingrese su PIN: ")
    val pin = readlnOrNull().orEmpty()

    if (pin != account.first) {
        println("❌ PIN incorrecto. Acceso denegado.")
        return
    }

    var balance = account.second
    while (true) {
        println("\n🔹 Menú del Cajero Automático 🔹")
        println("1. Consultar saldo")
        println("2. Retirar dinero")
        println("3. Ingresar dinero")
        println("4. Salir")
        print("Seleccione una opción: ")

        when (readlnOrNull().orEmpty()) {
            "1" -> println("💰 Su saldo actual es: $${"%.2f".format(balance)}")
            "2" -> {
                print("Ingrese el monto a retirar: ")
                val amount = readlnOrNull()?.toDoubleOrNull() ?: 0.0
                if (amount <= 0 || amount > balance) {
                    println("❌ Monto inválido o insuficiente.")
                } else {
                    balance -= amount
                    println("✅ Retiro exitoso. Nuevo saldo: $${"%.2f".format(balance)}")
                }
            }
            "3" -> {
                print("Ingrese el monto a ingresar: ")
                val amount = readlnOrNull()?.toDoubleOrNull() ?: 0.0
                if (amount <= 0) {
                    println("❌ Monto inválido.")
                } else {
                    balance += amount
                    println("✅ Depósito exitoso. Nuevo saldo: $${"%.2f".format(balance)}")
                }
            }
            "4" -> {
                println("Gracias por usar nuestro cajero. ¡Hasta pronto! 👋")
                exitProcess(0)
            }
            else -> println("❌ Opción no válida. Intente de nuevo.")
        }
    }
}

/**
 * Punto de entrada de la aplicación.
 */
fun main() {
    println("💳 Bienvenido al Cajero Automático 💳")
    print("Ingrese su número de tarjeta: ")
    val cardNumber = readlnOrNull().orEmpty().replace(" ", "")

    if (!isValidLuhn(cardNumber)) {
        println("❌ Número de tarjeta inválido.")
        return
    }

    atmOperations(cardNumber)
}
