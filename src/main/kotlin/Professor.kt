class Professor(
    var nome: String = "",
    var sobrenome: String = "",
    var tempoDeCasa: Int = 0,
    var codigo: Int = 0
) {
    // Bloco init para validar codigo maior que 0
    init {
        if (codigo < 0) {
            codigo = (codigo * -1)
        } else if (codigo == 0) {
            codigo = (1..10000).random()
        }
    }

    //Um professor será igual a outro se seus códigos de professor forem iguais.
    override fun equals(other: Any?): Boolean {
        return (other is Professor && other.codigo == this.codigo)
    }

    override fun hashCode(): Int {
        return codigo
    }
}