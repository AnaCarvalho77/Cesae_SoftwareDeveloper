package Ex_03;

public class main {
    public static void main(String[] args) {
        UserSessionManager sessionManager = UserSessionManager.getInstance();
        System.out.println("Token de Acesso: " + sessionManager.getSessionToken());
        System.out.println("Último Acesso: " + sessionManager.getLastAccess());

        sessionManager.setLastAccess();

        System.out.println("Token de Acesso: " + sessionManager.getSessionToken());
        System.out.println("Último Acesso: " + sessionManager.getLastAccess());
    }
}
