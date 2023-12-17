package Ex_02;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getInstance("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Singleton/src/Ex_02/application_log.txt");

        logger.log("Log 1: Variável x definida para 20");
        logger.log("Log 2: Objecto 'porshe' da Classe Car criado com sucesso");

        Logger myLogger = Logger.getInstance("/Users/anasofiacarvalho/Documents/GitHub/Cesae_SoftwareDeveloper/Singleton/src/Ex_02/programa_log.txt");
        logger.log("Log 3: Objecto 'mercedes' da Classe Car criado com sucesso");
        myLogger.log("Log 4: Método corrida invocado entre porshe e mercedes");
        myLogger.log("Log 5: Vencedor da corrida é porsche");
    }
}
