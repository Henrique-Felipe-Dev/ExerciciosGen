fun main(args: Array<String>) {

    /*
    Objetos - Estados e Comportamentos

    Objeto Cachorro:

    Estados (ou Atributos) - Cor do Pelo, Cor dos olhos, Nome, Raça

    Comportamentos (ou Métodos) - Latir, Correr, Abanar o Rabo

    Cada objeto dentro da nossa programação vai ter uma identidade única

     */

    /*

    Classe Pessoa - Nome, altura, peso, corDosOlhos, tomDePele, signo

    class Pessoa {

        Declarar os atributos e métodos

    }

     */


    //Instancia - Um objeto derivado de uma classe
    /*
    val mauricio = Pessoa()

    mauricio.nome = "Mauricio"
    mauricio.altura = 1.75
    mauricio.peso = 70.0
    mauricio.corDosOlhos = "Castanhos"
    mauricio.tomDePele = "Parda"
    mauricio.signo = "Escorpião"

    println("Nome - ${mauricio.nome}")
    println("Altura - ${mauricio.altura}")
    println("Peso - ${mauricio.peso}")
    println("Cor dos Olhos - ${mauricio.corDosOlhos}")
    println("Tom de Pele - ${mauricio.tomDePele}")
    println("Signo - ${mauricio.signo}")

    val henrique = Pessoa()

    henrique.nome = "Henrique"
    henrique.altura = 1.75
    henrique.peso = 70.0
    henrique.corDosOlhos = "Castanhos"
    henrique.tomDePele = "Parda"
    henrique.signo = "Libras"

    println("\nNome - ${henrique.nome}")
    println("Altura - ${henrique.altura}")
    println("Peso - ${henrique.peso}")
    println("Cor dos Olhos - ${henrique.corDosOlhos}")
    println("Tom de Pele - ${henrique.tomDePele}")
    println("Signo - ${henrique.signo}")

    //Printando a classe como um todo
    println(mauricio)
    println(henrique)
     */

    /*
    Métodos - Comportamentos (ou seja, as ações que os objetos derivados da classe
    podem executar)
     */

    /*

    Conta de Banco

    Atributos - Titular, Tipo, Saldo

    Métodos - Saque, Depósito e Saldo

     */

    //Instanciar um objeto ContaBanco
    /*
    val conta = ContaBanco()

    conta.titular = "Henrique"
    conta.tipo = 1
    conta.saldo = 2000.0

    //Chamar os métodos da ContaBanco
    conta.mostrarSaldo()

    println("Digite o valor de saque: ")
    val saque = readLine()!!.toDouble()

    conta.saque(saque)

    println("Digite o valor do depósito: ")
    val valor = readLine()!!.toDouble()

    conta.deposito(valor)

    conta.mostrarSaldo()
     */

    /*
    Construtores - Vão servir para instaciarmos o objeto com as informações
    obrigatórias que ele precisa
     */

    //Instanciar os objetos, passando informações no construtor

    val pessoa = Pessoa(
        "Henrique", 1.75, 70.0, "Castanhos",
        "Pardo", "Libra"
    )

    println(pessoa)





}
