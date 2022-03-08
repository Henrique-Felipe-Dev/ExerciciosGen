package heranca

//open - Diz que a classe poderá ser herdada no futuro

open class Pessoa (val nome: String, var idade: Int, val cpf: String) {

    var corDeCabelo = ""
    var corDaPele = ""

    //Indicando que a função falar pode ser sobrescrita pelas classes filhas
    open fun falar(){
        println("Falando")
    }

    fun escrever(){
        println("Escrevendo")
    }
}