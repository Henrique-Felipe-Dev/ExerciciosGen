package heranca

class Estudante(

    nome: String, idade: Int, cpf: String,
    val ra: Int

) : Pessoa(nome, idade, cpf){

    private var nota = 0.0

    fun alterarNota(valor: Double){

        if(valor < 0 || valor > 10){
            println("Nota Inválida")
        }else{
            nota = valor
            println("Nota inserida com sucesso!")
        }
    }

    override fun falar() {
        println("Opa")
    }

}