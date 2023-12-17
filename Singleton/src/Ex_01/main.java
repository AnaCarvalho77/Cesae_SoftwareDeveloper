package Ex_01;

public class main {
    public static void main(String[] args) {
        DatabaseConnection  databaseConnection3306 = DatabaseConnection.getInstance("jdbc:mysql://localhost:3306/mydatabase");
        DatabaseConnection  databaseConnection8808 = DatabaseConnection.getInstance("jdbc:mysql://localhost:8808/mydatabase");

        databaseConnection3306.connect();
        databaseConnection8808.connect();

        databaseConnection3306.disconnect();
        databaseConnection8808.disconnect();
    }
}
