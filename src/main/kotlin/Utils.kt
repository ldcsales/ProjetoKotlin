fun validarCodigo(cod: Int): Boolean {
    if (cod <= 0) {
        println("Codigo Invalido - Codigo deve ser maior que 0")
        return false
    }else{
        return true
    }
}