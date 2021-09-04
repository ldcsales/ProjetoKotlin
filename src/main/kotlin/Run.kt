fun main() {
    //var aluno1 = Aluno("Lucas", "Sales",1)
    //var aluno2 = Aluno("Fernando", "Freitas",1)



           // println(aluno1==aluno2)
    var digital = DigitalHouseManager()
    digital.registrarCurso("Matematica", 1,20)
    digital.registrarCurso("Quimica", 2,30)

    digital.imprimeCodigo()

    digital.excluirCurso(1)
    digital.imprimeCodigo()


}