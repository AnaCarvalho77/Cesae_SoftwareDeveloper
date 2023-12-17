package Ex_03;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Random;

public class UserSessionManager {
    Random aleatorio = new Random();
    private int sessionToken = aleatorio.nextInt();
    private String lastAccess= String.valueOf((LocalDateTime.now()));
    private static UserSessionManager instance;

    private UserSessionManager() {

    }

    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess() {
        this.lastAccess = String.valueOf(LocalDateTime.now());
    }



    public static UserSessionManager getInstance(){
        if(instance == null){
            instance = new UserSessionManager();
        }
        return instance;
    }





}
