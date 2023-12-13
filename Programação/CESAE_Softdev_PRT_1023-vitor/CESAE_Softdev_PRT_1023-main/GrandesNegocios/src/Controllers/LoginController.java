package Controllers;

import Domain.Utilizador;
import Repository.UtilizadorRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class LoginController {
    private ArrayList<Utilizador> utilizadoresSistema;

    public LoginController() throws FileNotFoundException {
        UtilizadorRepository repository = new UtilizadorRepository("Ficheiros/login_grandesNegocios.csv");
        this.utilizadoresSistema = repository.getUtilizadorsSistema();
    }

    public boolean validarLogin(String tipoUtilizador, String username, String password) {


        for (Utilizador utilizadorAtual : this.utilizadoresSistema) {
            if (username.equals(utilizadorAtual.getUsername()) && password.equals(utilizadorAtual.getPassword()) && tipoUtilizador.equals(utilizadorAtual.getTipoConta())) { // Encontramos o utilizador e a password corresponde.. Para além disso, o tipo de user é o correto
                return true;
            }
        }

        return false;
    }

    public static void adicionarUtilizador(String tipoUtilizador, String username, String password) throws IOException {
        File file = new File("Ficheiros/login_grandesNegocios.csv");
        FileWriter fW = new FileWriter(file,true);

        fW.append("\n" + tipoUtilizador + ";" + username + ";" + password);
        fW.close();
    }




}
