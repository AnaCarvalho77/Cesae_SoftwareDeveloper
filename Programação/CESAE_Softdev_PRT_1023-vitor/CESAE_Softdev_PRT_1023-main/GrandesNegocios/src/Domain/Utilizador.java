package Domain;

public class Utilizador {

    private String tipoConta;
    private String username;
    private String password;

    /**
     * metodo construtor que recebe varios os seguintes parametros:
     * @param tipoConta
     * @param username
     * @param password
     */
    public Utilizador(String tipoConta, String username, String password) {
        this.tipoConta = tipoConta;
        this.username = username;
        this.password = password;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
