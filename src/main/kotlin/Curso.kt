/*
Criar um diagrama de classes que modele a classe Curso. A princípio, um
curso possui um nome (String) e um código de curso (Integer).
 */
/*
Além de ter um nome e código de curso, um curso possui um professor titular
(ProfessorTitular), um professor adjunto (ProfessorAdjunto), uma quantidade
máxima de alunos (Integer) e uma lista de alunos matriculados.
*/

class Curso(
    var nome: String = "",
    var codigo: Int = 0,
    var qtdMaximaAlunos: Int = 0,
) {

    // Bloco init para validar codigo maior que 0
    init {
        if (codigo < 0) {
            codigo = (codigo * -1)
        } else if (codigo == 0) {
            codigo = (1..1000).random()
        }
        if (qtdMaximaAlunos < 0) {
            qtdMaximaAlunos = 0
        }
    }

    lateinit var listaMatriculados: MutableList<Aluno>
    lateinit var profTitular: ProfessorTitular
    lateinit var profAdjunto: ProfessorAdjunto

    //Um curso será igual a outro se seus códigos de curso forem iguais.

    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codigo == this.codigo)
    }

    override fun hashCode(): Int {
        return codigo
    }
}