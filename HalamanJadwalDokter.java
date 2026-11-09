import java.util.List;

public class HalamanJadwalDokter {
    private DokterController controller = new DokterController();

    public void renderJadwal() {
        System.out.println("=================================");
        System.out.println("       KATALOG JADWAL DOKTER     ");
        System.out.println("=================================");
        List<String> list = controller.getAllDokterAndJadwal();
        for (String dokter : list) {
            System.out.println(" - " + dokter);
        }
    }

    public void cariSpesialis(String keyword) {
        System.out.println("\n[UI] Filter spesialisasi: " + keyword);
        List<String> hasil = controller.filterJadwal(keyword);
        for (String item : hasil) {
            System.out.println(" [Hasil] " + item);
        }
    }

    public void klikReservasi(String idJadwal) {
        System.out.println("[UI] Redirect ke Halaman Form Reservasi dengan parameter id_jadwal: " + idJadwal);
    }
}
