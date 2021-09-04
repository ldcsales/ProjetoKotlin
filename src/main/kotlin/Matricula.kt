import java.util.*

/*
Criar um diagrama de classes que modele a classe Matrícula. A princípio,
uma matrícula tem um aluno (Aluno), um curso (Curso) e uma data de
matrícula (Date).

Criar um construtor de Matrícula que tome um aluno e um curso e construa
uma matrícula com a data do dia.
 */

class Matricula(
    var aluno: Aluno,
    var curso: Curso
) {
    init {
        var data = Date()
    }

}