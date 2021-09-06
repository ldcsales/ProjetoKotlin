fun main() {
    var dh = DigitalHouseManager()
    /*
    dh.registrarProfessorTitular("Joao", "Silva", 1, "BD")
    dh.registrarProfessorTitular("Fernando", "Souza", 2, "Android")
    dh.registrarProfessorAdjunto("Carol", "Fernandes", 3, 0)
    dh.registrarProfessorAdjunto("Rebeca", "Araujo", 4, 10)
    //dh.imprimeCodigosProfessores()
    dh.registrarCurso("Full Stack", 20001, 3)
    dh.registrarCurso("Android", 20002, 2)

    dh.alocarProfessores(20001, 1, 3)
    dh.alocarProfessores(20001, 2, 4)

    dh.registrarAluno("Lucas", "Sales", 1)
    dh.registrarAluno("Gabriel", "Nakamura", 2)
    dh.registrarAluno("Kaique", "Agostinho", 3)

    dh.matricularAluno(1, 20001)
    dh.matricularAluno(2, 20001)

    dh.matricularAluno(1, 20002)
    dh.matricularAluno(2, 20002)
    dh.matricularAluno(3, 20002)
    dh.imprimeCodigosProfessores()
    dh.imprimeCodigosAlunos()
    dh.consultarMatriculas(1)
*/
    dh.registrarCurso("Full Stack", 20001, 3)
    dh.registrarCurso("Android", 20002, 2)
    dh.imprimeCodigosCursos()
    dh.excluirCurso(20001)
    dh.imprimeCodigosCursos()


}