import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CalculadoraTest {

    /*

    @Test - Indica que a função que vamos declarar vai servir para testar alguma coisa

     */

    @Test
    fun somaTest(){
        /*
        asserts - Validar dados de qualquer tipo

        assertEquals(Resultado Esperado, Valor que a gente vai testar)
         */
        assertEquals(3.0, Calculadora.soma(1.0, 2.0))
        assertEquals(3, Calculadora.soma(1, 3))
    }

    @Test
    fun subtracaoTest(){

        assertEquals(3.0, Calculadora.subtracao(4.0, 1.0))

    }

}