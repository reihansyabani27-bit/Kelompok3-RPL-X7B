public class HalamanReservasi {
    private ReservasiController controller = new ReservasiController();

    public void renderView() {
        System.out.println("=================================");
        System.out.println("      FORM RESERVASI PASIEN      ");
        System.out.println("=================================");
    }

    public void submitReservasi(String idPasien, String idDokter, String idJadwal, String keluhan) {
        System.out.println("\n[UI] Konfirmasi reservasi untuk Jadwal: " + idJadwal + ", Keluhan: " + keluhan);
        boolean success = controller.createReservation(idPasien, idDokter, idJadwal, keluhan);

        if (success) {
            System.out.println("[UI] Berhasil! Tiket reservasi telah diterbitkan (Status: Menunggu Konfirmasi).");
        } else {
            System.out.println("[UI Error] Peringatan: Slot jadwal dokter pada sesi ini sudah penuh!");
        }
    }
}
