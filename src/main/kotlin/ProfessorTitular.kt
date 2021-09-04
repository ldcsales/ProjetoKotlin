class ProfessorTitular(
    var especialidade: String = "",
    nome: String,
    sobrenome: String,
    codigo: Int,
    tempoDeCasa: Int
) : Professor(
    nome,
    sobrenome,
    codigo,
    tempoDeCasa
) {


}