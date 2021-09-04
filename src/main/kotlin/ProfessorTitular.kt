class ProfessorTitular(
    var especialidade: String = "",
    nome: String,
    sobrenome: String,
    codigo: Int
) : Professor(
    nome,
    sobrenome,
    codigo
) {


}