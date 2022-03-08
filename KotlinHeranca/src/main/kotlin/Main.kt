import abstractClasses.Animal
import abstractClasses.Cachorro
import heranca.Estudante
import heranca.Funcionario
import heranca.Pessoa

fun main() {

    /*

    Herança - Classes Pai (ou seja, Superclasses) e classes filhas (ou seja, subclasses)

    Cada classe filha só poderá herdar de uma classe pai

    Polimorfismo - Uma mesma instrução computacional de formas diferentes

    Classes abstratas - É onde a classe pai não poderá ser instanciada, conseguimos
    utilizar dentro delas métodos abstratatos

    Interface - É onde todos os atributos e métodos ficam abstratos e os atributos dessa
    interface não podem ser inicializados

    Pesssoa - Classe Pai

    Estudante - Classe Filho de Pessoa

    Funcionario - Classe Filho de Pessoa


     */

    //Instancia da classe pai
    //val henrique = Pessoa("Henrique", 21, "456465456465")

    //Instancia da classe Estudante (que está herdando a classe Pessoa)
    /*
    val batman = Estudante(
        "Bruce Wayne", 30, "503496547-52", 456841251
    )

    batman.escrever()

    batman.corDeCabelo = "Loiro"

    batman.corDaPele = "Bronzeado"

    batman.alterarNota(10.0)
     */

    //Instancia da classe Funcionario
    /*
    val robin = Funcionario(
        "Robin", 25, "45646112554", 55555555
    )

    robin.salario = 1500.0

    robin.exibirSalario()
     */

    val cachorro = Cachorro(
        "Tobby", "Doméstico", "Canino", "Pastor Alemão"
    )

    cachorro.julgar()



}
