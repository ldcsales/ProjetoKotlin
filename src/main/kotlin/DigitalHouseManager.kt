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
        for (cont in listaCursos) {
            if (codigoCurso == cont.codigo) {
                println("Esse codigo ja existe. Nao e possivel registrar curso com o mesmo codigo")
                imprimeCodigos()
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

    //imprime os codigos dentro da lista de cursos.

    fun imprimeCodigos() {
        println("Lista de Codigos")
        for (cont in listaCursos) {
            println(cont.codigo)
        }
    }

    /*
    Criar um método na classe DigitalHouseManager que permita excluir um
curso. O método recebe como parâmetro o código do curso. O método deve
utilizar o código do curso para encontrá-lo na lista de cursos e excluí-lo da
lista.
○ fun excluirCurso(codigoCurso: Integer)
     */

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

    /*
    Criar um método na classe DigitalHouseManager que permita registrar um
professor adjunto. O método recebe como parâmetros o nome do professor, o
sobrenome, o código e a quantidade de horas disponíveis para monitoria. O
tempo de casa inicial do professor será zero. O método deve criar um
professor adjunto com os dados correspondentes e adicioná-lo à lista de
professores.

○ fun registrarProfessorAdjunto(nome: String , sobrenome: String ,
codigoProfessor: Integer, quantidadeDeHoras: Integer)
     */

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        quantidadeDeHoras: Int
    ) {

        for (cont in listaProfessores) {
            if (codigoProfessor == cont.codigo) {
                println("Esse Professor ja Existe.")
                return
            }
        }
        try {
            var professorAdjunto =
                ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, codigoProfessor, tempoDeCasa = 0)
            listaProfessores.add(professorAdjunto)
            println("Professor Adjunto Registrado")
        } catch (ex: Exception) {
            println("Nao foi possivel registrar esse professor! Tente Novamente.")
        }


    }




}
