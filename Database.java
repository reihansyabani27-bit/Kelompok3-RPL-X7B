import java.util.*;

public class Database {
    public static Map<String, String> userDb = new HashMap<>();
    public static Set<String> identitasDb = new HashSet<>();
    public static List<String> listDokter = new ArrayList<>(Arrays.asList(
        "dr. Andi (Spesialis Anak) - Pagi",
        "dr. Budi (Spesialis Gigi) - Siang",
        "dr. Citra (Spesialis Penyakit Dalam) - Sore"
    ));
    public static Map<String, Integer> slotJadwal = new HashMap<>();
    public static List<String> reservasiDb = new ArrayList<>();

    static {
        userDb.put("pasien@mail.com", "password123");
        identitasDb.add("317101001");
        slotJadwal.put("JDW-01", 3);
        slotJadwal.put("JDW-02", 0);
    }
}
