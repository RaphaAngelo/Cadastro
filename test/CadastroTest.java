import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CadastroTest {

    @Test
    void testNomeVazio() {
        assertEquals("Nome não pode ser vazio", Cadastro.validarNome(""));
    }

    @Test
    void testCpfInvalido() {
        assertEquals("CPF inválido", Cadastro.validarCpf("123456"));
    }

    @Test
    void testIdadeInvalida() {
        assertEquals("Idade inválida", Cadastro.validarIdade("-5"));
        assertEquals("Idade inválida", Cadastro.validarIdade("abc"));
    }

    @Test
    void testCpfValido() {
        assertNull(Cadastro.validarCpf("12345678901"));
    }
}