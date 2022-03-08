package heranca

open class Funcionario(
    nome: String, idade: Int, cpf: String,
    val cod: Int
) : Pessoa(nome, idade, cpf){

    var salario = 0.0

    fun exibirSalario(){
        println("O funcionário $nome atualmente ganha R$$salario de salário!")
    }

}