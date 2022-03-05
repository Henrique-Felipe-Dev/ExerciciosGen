fun main() {

    /*
    5) Crie uma classe patinete e apresente os atributos e métodos
    referentes esta classe, em seguida crie um objeto patinete, defina
    as instancias deste objeto e apresente as informações deste objeto
    no console.
     */

    val patinete = Patinete("Vermelho")

    patinete.buzina = true
    patinete.lanterna = true

    patinete.acelerar(10.0)

    patinete.buzinar()

    patinete.ligarDesligarLanterna()

    println(patinete)

    patinete.buzinar()

    patinete.freiar(50.0)

    patinete.ligarDesligarLanterna()

    println(patinete)

}