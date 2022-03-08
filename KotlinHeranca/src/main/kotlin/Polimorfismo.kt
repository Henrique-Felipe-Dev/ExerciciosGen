fun main(){

    /*
    Quando conseguimos ter dois métodos ou mais (com o mesmo nome, ou seja, é uma mesma
    instrução computaciona) fazendo funções diferentes

    Sobrecarga de Métodos - Que são métodos com o mesmo nome, mas podem ter parãmetros
    diferentes - Sempre acontece em tempo de compilação

    Sobrescrita de Métodos - Literalmente sobrescrever todos as instruções de um método
    já existente (através de métodos de uma classe pai)

     */

    soma(1.5, 5.4)

}

fun soma(num1: Int, num2: Int): Int{
    return num1 + num2
}

fun soma(num1: Double, num2: Double): Double{
    println("Soma com doubles!")
    return num1 + num2
}

fun soma(num1: Double, num2: Int): Double{
    return num1 + num2
}