package Tools;

import Domain.Utilizador;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVLoginWriter {
    private String filePath;

    public CSVLoginWriter(String filePath) {
        this.filePath = filePath;
    }

    public void writeCSVToRepository(String tipoUtilizador, String username, String password) throws IOException {

        File file = new File(this.filePath);
        FileWriter fW = new FileWriter(file,true);

      fW.append("\n" + tipoUtilizador + ";" + username + ";" + password);
        fW.close();

    }
}
