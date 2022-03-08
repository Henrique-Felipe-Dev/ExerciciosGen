package abstractClasses

//A palabra reservada abstract indica que a classe que está sendo criada é abstrata

abstract class Animal (val nome: String, var tipo: String, val especie: String){

    var corDoPelo = ""
    var sexo = ""

    fun correr(){
        println("Correndo")
    }

    fun morder(){
        println("Mordendo")
    }

    //Gerar métodos abstratos
    abstract fun farejar()
    abstract fun rosna()
    abstract fun julgar()


}