public class HalamanRegistrasi {
    private RegisterController controller = new RegisterController();

    public void renderView() {
        System.out.println("=================================");
        System.out.println("    HALAMAN REGISTRASI PASIEN    ");
        System.out.println("=================================");
    }

    public void handleRegister(String nama, String noIdentitas, String email, String password) {
        System.out.println("\n[UI] Mengirim data registrasi: " + nama + " (" + email + ")");
        boolean success = controller.registerUser(nama, noIdentitas, email, password);

        if (success) {
            System.out.println("[UI] Popup: Registrasi Berhasil! Silakan menuju Halaman Login.");
        } else {
            System.out.println("[UI Error] Akun/No Identitas sudah terdaftar di sistem!");
        }
    }
}
