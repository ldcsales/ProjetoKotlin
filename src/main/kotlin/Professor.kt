open class Professor(
    var nome: String = "",
    var sobrenome: String = "",
    var tempoDeCasa: Int = 0,
    var codigo: Int = 0
) {
    //Um professor será igual a outro se seus códigos de professor forem iguais.
    override fun equals(other: Any?): Boolean {
        return (other is Professor && other.codigo == this.codigo)
    }

    override fun hashCode(): Int {
        return codigo
    }
}