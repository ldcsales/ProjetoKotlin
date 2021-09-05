/*
Criar um diagrama de classes que modele a classe DigitalHouseManager.
A princípio, DigitalHouseManager tem uma lista de alunos, uma lista de
professores, uma lista de cursos e uma lista de matrículas
 */

class DigitalHouseManager {

    private var listaAlunos = mutableListOf<Aluno>()
    private var listaProfessores = mutableListOf<Professor>()
    private var listaCursos = mutableListOf<Curso>()
    private var listaMatriculas = mutableListOf<Matricula>()

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
                imprimeCodigosCursos()
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

    fun imprimeCodigosCursos() {
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

    /*
    Criar um método na classe DigitalHouseManager que permita registrar um
professor titular. O método recebe como parâmetros o nome do professor, o
sobrenome, o código e a especialidade. O tempo de casa inicial do professor
será zero. O método deve criar um professor titular com os dados
correspondentes e adicioná-lo à lista de professores.

○ fun registrarProfessorTitular(nome: String , sobrenome: String,
codigoProfessor: Integer, especialidade: String)
     */

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        especialidade: String
    ) {

        for (cont in listaProfessores) {
            if (codigoProfessor == cont.codigo) {
                println("Esse Professor ja Existe.")
                return
            }
        }
        try {
            var professorTitular =
                ProfessorTitular(especialidade, nome, sobrenome, codigoProfessor, tempoDeCasa = 0)
            listaProfessores.add(professorTitular)
            println("Professor Titular Registrado")
        } catch (ex: Exception) {
            println("Nao foi possivel registrar esse professor! Tente Novamente.")
        }


    }

    /*
    Criar um método na classe DigitalHouseManager que permita excluir um
professor. O método recebe como parâmetro o código do professor. O
método deve utilizar o código do professor para encontrá-lo na lista de
professores e eliminá-lo da lista.

○ fun excluirProfessor(codigoProfessor: Integer)
     */

    fun excluirProfessor(codigoProfessor: Int) {
        if (codigoProfessor < 0) {
            println("Codigo Invalido")
            return

        }
        for (cont in listaProfessores) {
            if (cont.codigo == codigoProfessor) {
                try {
                    listaProfessores.remove(cont)
                    println("Professor foi removido da lista.")
                    return
                } catch (ex: Exception) {
                    println("Nao foi possivel remover o professor da lista.")
                }
            }

        }
        println("Codigo de professor nao encontrado")
    }

    /*
    Criar um método na classe DigitalHouseManager que permita registrar um
aluno. O método recebe como parâmetros o nome, o sobrenome e o código
do aluno. O método deve criar um aluno com os dados correspondentes e
adicioná-lo à lista de alunos.

○ matricularAluno(nome: String, sobrenome: String, codigoAluno:
Integer)
     */

    fun registrarAluno(
        nome: String,
        sobrenome: String,
        codigoAluno: Int
    ) {
        for (cont in listaAlunos) {
            if (codigoAluno == cont.codigo) {
                println("Esse codigo ja existe. Nao e possivel registrar alunos com o mesmo codigo")
                imprimeCodigosAlunos()
                return
            }
        }
        try {
            var aluno = Aluno(nome, sobrenome, codigoAluno)
            listaAlunos.add(aluno)
            println("Aluno Registrado")
        } catch (ex: Exception) {
            println("Nao foi possivel registrar esse Aluno! Tente Novamente.")
        }
    }

    //imprime os codigos dentro da lista de alunos.

    fun imprimeCodigosAlunos() {
        println("Lista de Codigos")
        for (cont in listaAlunos) {
            println(cont.codigo)
        }
    }
/*
    Criar um método na classe DigitalHouseManager que permita matricular um
    aluno em um curso. O método recebe como parâmetros o código do aluno e
    o código do curso em que ele está se matriculando.

    ○ matricularAluno(codigoAluno: Integer, codigoCurso: Integer)

    O método deve:
    ● Encontrar o curso em que o aluno está se matriculando.
    ● Encontrar o aluno que queremos matricular.
    ● Matricular o aluno, se for possível.
    ● No caso de ser possível, criar uma matrícula e configurá-la com os
    dados correspondentes.
    ○ Adicionar a matrícula à lista de matrículas.
    ○ Informar na tela que a matrícula foi realizada.
    ● Se não houver vagas disponíveis:
    ○ Informar na tela que não foi possível realizar a matrícula porque
    não há vagas.
*/

    fun matricularAluno(
        codigoAluno: Int,
        codigoCurso: Int
    ) {
        if (existeCurso(codigoCurso)) {
            if (existeAluno(codigoAluno)) {
                var aluno = buscarAluno(codigoAluno)
                var curso = buscarCurso(codigoCurso)
                try {
                    var matricula = Matricula(aluno, curso)
                    listaMatriculas.add(matricula)
                    println("Matricula Realizada")
                } catch (ex: Exception) {
                    println("Nao foi possivel realizar a matricula. Tente novamente")
                }
            } else {
                println("Aluno nao encontrado")
            }
        } else {
            println("Curso nao encontrado")
        }


    }

//Consultar se existe o aluno na lista de alunos cadastrados

    private fun existeAluno(codigoAluno: Int): Boolean {
        for (cont in listaAlunos) {
            if (cont.codigo == codigoAluno) {
                return true
            }
        }
        return false
    }

//Retorna aluno da lista

    private fun buscarAluno(codigoAluno: Int): Aluno? {
        for (aluno in listaAlunos) {
            if (aluno.codigo == codigoAluno) {
                return aluno
            }
        }
        return null
    }


//Consultar se existe o curso na lista de cursos cadastrados

    private fun existeCurso(codigoCurso: Int): Boolean {
        for (cont in listaCursos) {
            if (cont.codigo == codigoCurso) {
                return true
            }
        }
        return false
    }


// Retorna curso da lista

    private fun buscarCurso(codigoCurso: Int): Curso? {
        for (curso in listaCursos) {
            if (curso.codigo == codigoCurso) {
                return curso
            }
        }
        return null
    }

    // Retorna professor da lista

    private fun buscarProfessor(codigoProfessor: Int): Professor? {
        for (professor in listaProfessores) {
            if (professor.codigo == codigoProfessor) {
                return professor
            }
        }
        return null
    }

    //Consultar se existe o profressor na lista de professores cadastrados

    private fun existeProfessor(codigoProfessor: Int): Boolean {
        for (professor in listaProfessores) {
            if (professor.codigo == codigoProfessor) {
                return true
            }
        }
        return false
    }

    /*
    Criar um método na classe DigitalHouseManager que permita alocar
professores a um curso. O método recebe como parâmetros o código do
curso, o código do professor titular e o código do professor adjunto.
○ fun alocarProfessores(codigoCurso: Integer,
codigoProfessorTitular: Integer, codigoProfessorAdjunto:
Integer)
O método deve:
● Encontrar o professor titular na lista de professores.
● Encontrar o professor adjunto na lista de professores.
● Alocar ambos professores ao curso.
     */

    fun alocarProfessores(
        codigoCurso: Int,
        codigoProfessorTitular: Int,
        codigoProfessorAdjunto: Int
    ) {
        if (existeProfessor(codigoProfessorTitular)) {
            if (existeProfessor(codigoProfessorAdjunto)) {
                if (existeCurso(codigoCurso)) {
                    var profTitular = buscarProfessor(codigoProfessorTitular)
                    var profAdjunto = buscarProfessor(codigoProfessorAdjunto)
                    var curso = buscarCurso(codigoCurso)
                    try {
                        curso?.profTitular = profTitular as ProfessorTitular
                        curso?.profAdjunto = profAdjunto as ProfessorAdjunto
                        println("Realizado alocacao de professores")
                    } catch (ex: Exception) {
                        println("Nao foi possivel realizar a alocacao de professores. Tente novamente")
                    }
                }
            } else {
                println("Professor Adjunto nao encontrado")
            }
        } else {
            println("Professor Titular nao encontrado")
        }
    }


}



