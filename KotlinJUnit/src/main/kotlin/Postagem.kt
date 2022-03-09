data class Postagem (val id: Int, var titulo: String, var descricao: String) {

    //Faz a verificação dos campos, para ver se a postagem foi criada da maneira correta
   fun validarCampos(): Boolean{
        return titulo == "" || descricao == ""
    }

    //Caso não tenha sido criada corretamente, joga uma exceção
    /*
    init {
        if(validarCampos()){
            throw Exception("Postagem criada da maneira errada")
        }
    }
     */

    //Função que altera o titulo com dados não vazios
    fun editarTitulo(newTitulo: String){
        if(newTitulo.isEmpty()){
            println("Valor inválido")
        }else{
            titulo = newTitulo
            println("Titulo alterado com sucesso!")
        }
    }

    //Função que altera a descrição com dados não vazios
    fun editarDescricao(newDesc: String){
        if(newDesc.isEmpty()){
            println("Valor inválido")
        }else{
            descricao = newDesc
            println("Titulo alterado com sucesso!")
        }
    }

}