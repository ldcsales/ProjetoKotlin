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

    // Bloco init para validar quantidade alunos maior que 0
    init {
        if (qtdMaximaAlunos < 0) {
            qtdMaximaAlunos = 0
        }
    }

    var qtdAtualAlunos = 0

    var listaMatriculados = mutableListOf<Aluno?>()
    var profTitular: ProfessorTitular? = null
    var profAdjunto: ProfessorAdjunto? = null

    //Um curso será igual a outro se seus códigos de curso forem iguais.

    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codigo == this.codigo)
    }

    override fun hashCode(): Int {
        return codigo
    }

    /*
    Criar um método na classe Curso que permita adicionar um aluno à lista. O
    método retornará true se o aluno puder ser adicionado ou false caso não
    haja vagas disponíveis.
        ● fun adicionarUmAluno(umAluno: Aluno): Boolean
     */

    fun adicionarUmAluno(umAluno: Aluno?): Boolean {
        if (qtdAtualAlunos < qtdMaximaAlunos) {
            try {
                listaMatriculados.add(umAluno)
                qtdAtualAlunos++
                println(
                    yellow +
                            """
                -------------------------------
                -------Aluno Matriculado-------    
            """.trimIndent() + reset
                )
                println("Codigo: ${umAluno?.codigo}")
                println("Nome: ${umAluno?.nome} ${umAluno?.sobrenome}")
                println(yellow + "-------------------------------" + reset)
                println("Restam ${(qtdMaximaAlunos - qtdAtualAlunos)} vagas nesse curso.")
                return true
            } catch (ex: Exception) {
                println(red + "Nao foi possivel adicionar esse Aluno ao curso! Tente Novamente.\n" + reset)
                return false
            }
        } else {
            println(red + "Quantidade Maxima de alunos ja foi atingida.\n" + reset)
            return false
        }
    }

    /*
    Criar um método na classe Curso que permita excluir um aluno da lista de
    alunos do curso.
        ● fun excluirAluno(umAluno: Aluno)
     */

    fun excluirAluno(umAluno: Aluno) {
        listaMatriculados.remove(umAluno)
        qtdAtualAlunos--
        println(
            yellow +
                    """
                -------------------------------
                -------Aluno Removido-------    
            """.trimIndent() + reset
        )
        println(red + "Codigo: ${umAluno?.codigo}" + reset)
        println(red + "Nome: ${umAluno?.nome} ${umAluno?.sobrenome}" + reset)
        println(yellow + "-------------------------------" + reset)
        println("Restam ${(qtdMaximaAlunos - qtdAtualAlunos)} vagas nesse curso.")
    }


}