class Patinete (var cor: String) {

    //Atributos
    var rodas = 0
    var guidao = ""
    var buzina = false
    var lanterna = false
    var lanternaOnOff = false
    var velocidade = 0.0
    var motor = false

    //Buzinar
    fun buzinar(){
        if(buzina){
            println("Biiiiiiiiiii")
        }else{
            println("Esse patinete não tem buzina")
        }
    }

    //Acelerar
    fun acelerar(valor: Double){
        velocidade += valor
    }

    fun freiar(valor: Double){
        velocidade -= valor

        if(velocidade < 0){
            velocidade = 0.0
        }
    }

    fun ligarDesligarLanterna(){
        if(lanterna){
            lanternaOnOff = !lanternaOnOff
        }
    }

    override fun toString(): String {
        return "Buzina - $buzina" +
                "\nVelocidade - $velocidade" +
                "\nLanterna - $lanternaOnOff"
    }

}