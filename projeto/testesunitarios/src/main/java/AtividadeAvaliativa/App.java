package AtividadeAvaliativa;

public class App {
    private App() {
    }
    public static void main(String[] args) {
        ValidarSenha minhaSenha = new ValidarSenha();

        ValidarUsuario meuEmail = new ValidarUsuario();

        ValidarNome meuNome = new ValidarNome();

        System.out.print("Validador de Senha");
        System.out.println("\nStatus: " + minhaSenha.ValidarSenha ("Bruno@1235"));
        System.out.print("Validador de Email");
        System.out.println("\nStatus: " + meuEmail.ValidarUser("bruno@gmail.com"));
        System.out.print("Validador de Nome");
        System.out.println("\nStatus: " + meuNome.validarNome("Bruno"));

    }
}
