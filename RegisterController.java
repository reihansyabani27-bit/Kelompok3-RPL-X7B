public class RegisterController {
    public boolean registerUser(String nama, String noIdentitas, String email, String password) {
        if (Database.userDb.containsKey(email) || Database.identitasDb.contains(noIdentitas)) {
            return false;
        }
        Database.userDb.put(email, password);
        Database.identitasDb.add(noIdentitas);
        return true;
    }
}
