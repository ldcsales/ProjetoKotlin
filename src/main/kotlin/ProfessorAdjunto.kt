/*
Queremos adicionar duas categorias de professores ao modelo anterior. Os
professores titulares e os professores adjuntos. Um professor titular tem uma
especialidade (String) e um professor adjunto tem uma quantidade de horas de
monitoria (Integer).
 */

//Professor Adjunto herda de Professor

class ProfessorAdjunto(
    var horasMonitoria: Int = 0,
    nome: String,
    sobrenome: String,
    codigo: Int
) : Professor(
    nome,
    sobrenome,
    codigo
) {
}