package AtividadeAvaliativa;

public class ValidarUsuario {

    public boolean ValidarUser (String email) {
        if (email == null || email.isBlank()) {
            return false;
        }
        if (email.length() < 8 ){
            return false;
        }

        boolean possuiEspecial =
                email.matches(".*[ @ ].*");
        return possuiEspecial;
    }
}
