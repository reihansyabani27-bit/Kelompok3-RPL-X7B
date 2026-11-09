public class AuthController {
    public boolean submitLogin(String email, String password) {
        if (Database.userDb.containsKey(email)) {
            String dbPassword = Database.userDb.get(email);
            if (dbPassword.equals(password)) {
                createSession("Pasien");
                return true;
            }
        }
        return false;
    }

    private void createSession(String role) {
        System.out.println("[System Log] Session dibuat untuk role: " + role);
    }
}
