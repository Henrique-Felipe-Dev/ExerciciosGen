package encap

data class Estudante (private val nome: String, private val ra: Int){

    private var nota = 0.0

    private val cursos = mutableListOf<String>()

    /*
    No momento que a classe ser instanciada, vamos verificar se o nome não é vazio
    e se o ra não é zero

    Criar uma exceção personalizada - Exception("Mensagem de Erro")

     */

    //Init - Executa um bloco de código no momento que criamos uma instancia da classe
    init {
        if(nome.isEmpty() || ra == 0){
            throw Exception("Classe sendo instanciada de maneira incorreta!")
        }else{
            println("Olha só, classe instanciada!")
        }

    }

    fun alterarNota(valor: Double){

        if(valor < 0 || valor > 10){
            println("Nota inválida")
        }else{
            nota = valor
            println("Nota alterada com sucesso!")
        }
    }

    fun cadastrarCurso(curso: String){

        if(curso.isEmpty()){
            println("Curso inválido")
        }else{
            cursos.add(curso)
        }

    }

    fun removerCurso(curso: String){
        if(curso.isEmpty()){
            println("Curso inválido")
        }else if(cursos.contains(curso)){
            cursos.remove(curso)
            println("Curso removido com sucesso")
        }else{
            println("Esse curso não existe na lista")
        }
    }

    fun listarCursos(){
        cursos.forEach {
            println(it)
        }
    }

}
