class Professor(
    var nome: String = "",
    var sobrenome: String = "",
    var tempoDeCasa: Int = 0,
    var codigo: Int = 0
) {
    init {
        if (codigo < 0) {
            codigo = (codigo * -1)
        } else if (codigo == 0) {
            codigo = (1..10000).random()
        }
    }
}