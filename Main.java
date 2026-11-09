public class Main {
    public static void main(String[] args) {
        System.out.println(">>> SIMULASI SISTEM RESERVASI KLINIK (KELOMPOK 3) <<<\n");

        // 1. Modul Registrasi (Angga)
        HalamanRegistrasi regView = new HalamanRegistrasi();
        regView.renderView();
        regView.handleRegister("Budi Santoso", "317109999", "budi@mail.com", "budi123");

        // 2. Modul Login (Reihan)
        HalamanLogin loginView = new HalamanLogin();
        loginView.renderView();
        loginView.handleLogin("budi@mail.com", "budi123");

        // 3. Modul Jadwal Dokter (Faisal)
        HalamanJadwalDokter jadwalView = new HalamanJadwalDokter();
        jadwalView.renderJadwal();
        jadwalView.cariSpesialis("Gigi");
        jadwalView.klikReservasi("JDW-01");

        // 4. Modul Reservasi (Repiyanto)
        HalamanReservasi resView = new HalamanReservasi();
        resView.renderView();
        resView.submitReservasi("PASIEN-001", "DOK-01", "JDW-01", "Sakit gigi geraham kanan");
    }
}
