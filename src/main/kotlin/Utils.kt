fun validarCodigo(cod: Int): Boolean {
    if (cod <= 0) {
        println(red + "Codigo Invalido - Codigo deve ser maior que 0.\n" + reset)
        return false
    } else {
        return true
    }
}

const val red = "\u001b[31m"
const val yellow = "\u001b[33m"
const val green = "\u001b[32m"
const val reset = "\u001b[0m"