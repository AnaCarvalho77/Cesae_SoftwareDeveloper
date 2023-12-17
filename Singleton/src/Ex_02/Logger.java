package Ex_02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    private String nomeFicheiro;
    private static Logger instance;


    private Logger(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }

    public static Logger getInstance(String nomeFicheiro){
        if(instance == null){
            instance = new Logger(nomeFicheiro);
        }
        return instance;
    }

    public void log(String frase) throws IOException {
        File ficheiroLog = new File(this.nomeFicheiro);
        FileWriter escrever = new FileWriter(ficheiroLog,true);
        LocalDateTime localDateTime = LocalDateTime.now();
        escrever.append(localDateTime + ": " + frase + "\n");
        escrever.close();


    }


}
