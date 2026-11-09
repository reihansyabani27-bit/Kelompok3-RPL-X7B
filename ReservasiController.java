public class ReservasiController {
    public boolean createReservation(String idPasien, String idDokter, String idJadwal, String keluhan) {
        int sisaSlot = Database.slotJadwal.getOrDefault(idJadwal, 0);

        if (sisaSlot > 0) {
            Database.slotJadwal.put(idJadwal, sisaSlot - 1);
            String tiket = "RES-" + System.currentTimeMillis() + " | Pasien: " + idPasien + " | Status: Menunggu";
            Database.reservasiDb.add(tiket);
            return true;
        } else {
            return false;
        }
    }
}
