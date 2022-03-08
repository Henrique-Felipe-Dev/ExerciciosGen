package interfacess

class Programador(
    override val nome: String, override var pisoSalarial: Double,
    override var bonus: Double, var nivel: String
) : Trabalhador, PessoaInt {

    override var salario = 0.0
    override val cpf = ""
    override val rg = ""


    override fun calcularSalario() {
        salario = pisoSalarial + bonus
        println("O salário de um programador é $salario")
    }

}