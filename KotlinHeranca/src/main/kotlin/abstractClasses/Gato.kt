package abstractClasses

class Gato(
    nome: String, tipo: String, especie: String, val ronronando: Boolean
) : Animal(nome, tipo, especie) {

    override fun farejar() {
        println("Farejando como um gato")
    }

    override fun rosna() {
        TODO("Not yet implemented")
    }

    override fun julgar() {
        TODO("Not yet implemented")
    }


}