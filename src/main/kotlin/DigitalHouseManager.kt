/*
Criar um diagrama de classes que modele a classe DigitalHouseManager.
A princípio, DigitalHouseManager tem uma lista de alunos, uma lista de
professores, uma lista de cursos e uma lista de matrículas
 */

class DigitalHouseManager {

    lateinit var listaAlunos: MutableList<Aluno>
    lateinit var listaProfessores: MutableList<Professor>
    lateinit var listaCursos: MutableList<Curso>
    lateinit var listaMatriculas: MutableList<Matricula>
}