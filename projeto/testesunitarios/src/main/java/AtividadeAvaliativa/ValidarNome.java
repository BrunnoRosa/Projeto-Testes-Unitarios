package AtividadeAvaliativa;

public class ValidarNome {

    public boolean validarNome(String nome) {
        if (nome == null || nome.isBlank()) {
            return false;
        }
        if (nome.length() < 3) {
            return false;
        }
        boolean possuiLetra =
                nome.matches(".*[a-zA-Z].*");
        return  possuiLetra;

    }
}