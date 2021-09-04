/*
Criar um diagrama de classes que modele a classe DigitalHouseManager.
A princípio, DigitalHouseManager tem uma lista de alunos, uma lista de
professores, uma lista de cursos e uma lista de matrículas
 */

class DigitalHouseManager {

    var listaAlunos = mutableListOf<Aluno>()
    var listaProfessores = mutableListOf<Professor>()
    var listaCursos = mutableListOf<Curso>()
    var listaMatriculas = mutableListOf<Matricula>()

    /*
    Criar um método na classe DigitalHouseManager que permita registrar um
curso. O método recebe como parâmetros o nome do curso, o código e a
quantidade máxima de alunos admitidos. O método deve criar um curso com
os dados correspondentes e adicioná-lo à lista de cursos.

    ○ fun registrarCurso(nome: String, codigoCurso: Integer,
    quantidadeMaximaDeAlunos: Integer )
     */

    fun registrarCurso(
        nome: String,
        codigoCurso: Int,
        quantidadeMaximaDeAlunos: Int
    ) {
        for(cont in listaCursos){
            if(codigoCurso == cont.codigo){
                println("Esse codigo ja existe. Nao e possivel registrar curso com o mesmo codigo")
                imprimeCodigo()
                return
            }
        }
        try {
            var curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
            listaCursos.add(curso)
            println("Curso Registrado")
        } catch (ex: Exception) {
            println("Nao foi possivel registrar esse curso! Tente Novamente.")
        }


    }

    fun imprimeCodigo(){
        println("Lista de Codigos")
        for (cont in listaCursos){
            println(cont.codigo)
        }
    }

    fun excluirCurso(codigoCurso: Int) {
        if (codigoCurso < 0) {
            println("Codigo Invalido")
            return

        }
        for (cont in listaCursos) {
            if (cont.codigo == codigoCurso) {
                try {
                    listaCursos.remove(cont)
                    println("Curso foi removido da lista.")
                    return
                } catch (ex: Exception) {
                    println("Nao foi possivel remover o curso da lista.")
                }
            }

        }
        println("Codigo de curso nao encontrado")
    }
}
