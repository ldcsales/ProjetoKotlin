/*Criar um diagrama de classes que modele a classe Aluno. A princípio, um
aluno possui um nome (String), um sobrenome (String) e um código de
aluno (Integer).
*/

/*Criar um construtor para o aluno que tome como parâmetro um nome, um
sobrenome e um código de aluno.
*/

class Aluno(
    var nome: String = "",
    var sobrenome: String = "",
    var codigo: Int = 0,
) {

//Um aluno será igual a outro se seus códigos de aluno forem iguais.

    override fun equals(other: Any?): Boolean {
        return (other is Aluno && other.codigo == this.codigo)
    }

    override fun hashCode(): Int {
        return codigo
    }

}
