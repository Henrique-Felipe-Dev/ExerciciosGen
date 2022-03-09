import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PostagemTest {

    val postagem1 = Postagem(0, "Viagem", "Viagem Top")
    val postagem2 = Postagem(0, "", "Viagem Top")

    @Test
    fun validarCamposTest() {
        assertFalse(postagem1.validarCampos())
        assertTrue(postagem2.validarCampos())
    }

    @Test
    fun editarTituloTest(){

        postagem1.editarTitulo("Santos")

        assertEquals("Santos", postagem1.titulo)

    }



}