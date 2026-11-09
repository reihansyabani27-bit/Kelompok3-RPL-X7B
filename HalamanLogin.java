public class HalamanLogin {
    private AuthController controller = new AuthController();

    public void renderView() {
        System.out.println("=================================");
        System.out.println("       HALAMAN LOGIN SISTEM      ");
        System.out.println("=================================");
    }

    public void handleLogin(String email, String password) {
        System.out.println("\n[UI] Menekan tombol login dengan email: " + email);
        boolean success = controller.submitLogin(email, password);

        if (success) {
            System.out.println("[UI] Redirect ke Dashboard sesuai Hak Akses!");
        } else {
            System.out.println("[UI Error] Email atau Password salah! Gagal login.");
        }
    }
}
