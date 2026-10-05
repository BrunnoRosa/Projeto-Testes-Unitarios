import AtividadeAvaliativa.ValidarNome;
import AtividadeAvaliativa.ValidarSenha;
import AtividadeAvaliativa.ValidarUsuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidacaoSenhaServiceTest {

    private ValidarSenha service =
            new ValidarSenha();

    @Test
    public void deveAceitarSenhaValida() {
        String senha = "Java@12345";
        boolean resultado =
                service.ValidarSenha(senha);
        assertTrue(resultado);

    }

    private ValidarUsuario usuario =
            new ValidarUsuario();
    @Test
    public void deveAceitarEmailValido() {
        String user = "bruno@gmail.com";
        boolean resultado = usuario.ValidarUser(user);
        assertTrue(resultado);

    }

    private ValidarNome nome = new ValidarNome();

    @Test
    public void deveAceitarNomeValido(){
        String nomeValido = "Bruno";
        boolean resultado = nome.validarNome(nomeValido);
        assertTrue(resultado);
    }

}

