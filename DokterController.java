import java.util.ArrayList;
import java.util.List;

public class DokterController {
    public List<String> getAllDokterAndJadwal() {
        return Database.listDokter;
    }

    public List<String> filterJadwal(String spesialisasi) {
        List<String> result = new ArrayList<>();
        for (String d : Database.listDokter) {
            if (d.toLowerCase().contains(spesialisasi.toLowerCase())) {
                result.add(d);
            }
        }
        return result;
    }
}
