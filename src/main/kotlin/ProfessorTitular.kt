class ProfessorTitular(
    var especialidade: String = "",
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigo: Int,
) : Professor(
    nome,
    sobrenome,
    tempoDeCasa,
    codigo
) {


}