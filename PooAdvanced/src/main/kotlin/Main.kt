import `object`.Estoque
import calc.Calculadora
import encap.Cliente
import encap.Estudante

fun main() {

    /*

    Companion Object - Atributos e métodos sem precisar instanciar uma classe;

    Objetos Anônimos - São objetos que só são instanciados uma única vez

    Encapsulamento - Deixar os nossos dados protegidos

    Exceção - Soltar exceções personalizadas e tratar essas exceções

     */

    //Exemplo utilizando métodos do companion object

    /*
    Calculadora.adicao(10.0, 20.0)

    Calculadora.divisao(4.0, 2.0)
     */


    //Exemplo utilizando objetos anônimos
    //Estoque.addLista("Toddy")

    /*

    Encapsulamento - Uso de algumas palavras reservadas para proteger tanto atributos
    quanto métodos

    default - Nenhum dos dados da classe são protegidos, ou seja, todo mundo do mesmo
    pacote pode acessar os métodos e atributos da classe

    public - Deixa todos os métodos e atributos públicos para qualquer classe acessar
    (independete do pacote)

    private - Deixa os métodos e atributos de uma classe privados, ou seja, só podem ser
    acessados dentro dela

    protected - Deixa os métodos e atributos de uma classe para só poderem ser acessados
    pela classe em si e pelas classes filhas
     */

    //Exemplo de um objeto de uma classe com encapsulamento
    /*
    val jaquim = Estudante("Jaquim", 123)

    jaquim.alterarNota(5.0)


    jaquim.cadastrarCurso("Inglês")
    jaquim.cadastrarCurso("Japonês")

    jaquim.listarCursos()
     */

    //val num: Int = readLine()!!.toInt()

    /*
    Try catch - Tentar executar o bloco de código e caso não dê certo, ele vai
    capturar a excessão, sem quebrar o código

    Toda a exceção dentro do Kotlin é derivada da classe Exception

     */

    //Exemplo simples try...catch
    /*
    try {
        val num: Int = readLine()!!.toInt()
    }catch (e: Exception){
        println(e.message)
    }
     */

    //Exemplo com números

    /*
    var idade = 0

    while (true){

        try {
            idade = readLine()!!.toInt()
            break
        }catch (e: Exception){
            println("Idade inválida")
        }
    }
     */

    /*
    try {
        val asf = Estudante("asf", 123)
    }catch (e: Exception){
        println(e.message)
    }
     */

    //Exemplo armazenando objetos dentro de listas

    /*
    val listaEstudantes = mutableListOf<Estudante>()

    listaEstudantes.add(Estudante("Henrique", 123))
    listaEstudantes.add(Estudante("Rogério", 123))
    listaEstudantes.add(Estudante("Maria", 123))
    listaEstudantes.add(Estudante("Fernando", 123))

    listaEstudantes.forEach {
        println(it)
    }

    if(listaEstudantes.contains(Estudante("Henrique", 123))){
        listaEstudantes.remove(Estudante("Henrique", 123))
    }

    listaEstudantes.forEach {
        println(it)
    }
     */

    print("Olá, cliente, digite o seu nome: ")
    val nome = readLine()!!

    print("Digite o seu endereço: ")
    val endereco = readLine()!!

    print("Digite o seu telefone: ")
    val telefone = readLine()!!

    try {
        val cliente = Cliente(
            nome, endereco,
            telefone
        )

        while(true){

            println("\n***Menu***\n")

            println("1 - Adicione itens no carrinho")
            println("2 - Remove itens do carrinho")
            println("3 - Liste os itens do carrinho")
            println("Digite qualquer outro valor para sair")

            var opc = 0

            while (true){
                println("\nDigite a opção desejada: ")

                try {
                    opc = readLine()!!.toInt()
                    break
                }catch (e: Exception){
                    println("Valor inválido")
                }
            }

            when(opc){

                1 -> {
                    println("Digite o item a ser adicionado: ")
                    val item = readLine()!!
                    cliente.addCompra(item)
                }
                2 -> {
                    println("Digite o item a ser removido: ")
                    val item = readLine()!!
                    cliente.removeCompra(item)
                }

                3 -> cliente.listarCompras()

                else -> break

            }

        }

    }catch (e: Exception){
        println(e.message)
    }



}