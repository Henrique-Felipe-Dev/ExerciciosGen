import kotlin.math.sign
/*
data class - Classe totalmente resposável pela manipulação de dados
 */
data class Pessoa (var nome: String, var altura: Double){

    //Atributos - variáveis que nós declaramos dentro de uma classe
    //Classe Pessoa - Nome, altura, peso, corDosOlhos, tomDePele, signo

    var peso = 0.0
    var corDosOlhos = ""
    var tomDePele = ""
    var signo = ""

    //Declarando construtores secundários
    /*
    constructor( informações ) : this(referência dos atributos do construtor anterior){

        Referenciar os atributos já existentes, que não foram adicionados no
        construtor anterior, com o valor do construtor atual

        Exemplo:
        this.peso = peso

    }
     */
    constructor(
        nome: String, altura: Double, peso: Double, corDosOlhos: String
    ) : this(nome, altura){

        this.peso = peso
        this.corDosOlhos = corDosOlhos
    }

    constructor(
        nome: String,
        altura: Double,
        peso: Double,
        corDosOlhos: String,
        tomDePele: String,
        signo: String
    ) : this(nome, altura, peso, corDosOlhos){

        this.tomDePele = tomDePele
        this.signo = signo

    }

    /*
    override fun toString(): String {
        return "Nome  - $nome" +
                "\nAltura - $altura" +
                "\nPeso - $peso" +
                "\nCor dos Olhos - $corDosOlhos" +
                "\nTom da Pele - $tomDePele" +
                "\nSigno - $signo"
    }
     */

}