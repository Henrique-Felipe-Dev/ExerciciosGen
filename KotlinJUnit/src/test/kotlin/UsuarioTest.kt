import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled

internal class UsuarioTest {

    val usuario = Usuario("", "")

    @Test
    fun verificarCadastroTest() {
        assertTrue(usuario.verificarCadastro())
    }

    @Test
    fun alterarLoginTest(){
        val novoLogin = "Henrique"

        usuario.alterarLogin(novoLogin)

        assertEquals(novoLogin, usuario.login)
    }

    @Test
    fun criarPostagemTest(){

        usuario.criarPostagem(0, "Viagem", "Viagem Top")

        assertEquals(
            Postagem(0, "Viagem", "Viagem Top"),
            usuario.postagens[0]
        )

    }


}