package calc

class Calculadora {

    /*
    Companion - Para quando tivermos a necessidade de ter um método ou atributo que
    possa ser chamado sem a necessidade de instanciarmos a um objeto da classe
     */

    companion object{

        fun adicao(num1: Double, num2:Double){
            val result = num1 + num2
            println("A soma de $num1 + $num2 é igual a $result")
        }

        fun subtracao(num1: Double, num2:Double){
            val result = num1 - num2
            println("A soma de $num1 + $num2 é igual a $result")
        }

        fun divisao(num1: Double, num2:Double){
            val result = num1 / num2
            println("A soma de $num1 + $num2 é igual a $result")
        }

    }

}