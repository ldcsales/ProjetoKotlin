fun main() {
    //var aluno1 = Aluno("Lucas", "Sales",1)
    //var aluno2 = Aluno("Fernando", "Freitas",1)



           // println(aluno1==aluno2)
    var digital = DigitalHouseManager()
    digital.registrarCurso("Full Stack", 20001,3)
    digital.registrarCurso("Android", 20002,2)

    digital.imprimeCodigosCursos()

    digital.excluirCurso(1)
    digital.imprimeCodigosCursos()


}