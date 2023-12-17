package Ex_01;

public class DatabaseConnection {
    private String connectionString;
    private static DatabaseConnection instance;

    private DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static synchronized DatabaseConnection getInstance(String connectionString){
        if(instance == null){
            instance = new DatabaseConnection(connectionString);
        }
        return instance;
    }

    public void connect(){
        System.out.println("Conectado à base de Dados: " + this.connectionString);
    }

    public void disconnect(){
        System.out.println("Está disconectado da base de dados: " + this.connectionString);
    }
}
