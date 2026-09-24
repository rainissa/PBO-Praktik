package id.ac.polban.model;

public class Dokter {
    private final String namaDokter;
    private String spesialisasi;

    public Dokter(String namaDokter, String spesialisasi) {
        this.namaDokter = namaDokter;
        this.spesialisasi = spesialisasi;
    }

    public String getNamaDokter() {
        return namaDokter;
    }
    public String getSpesialisasi() {
        return spesialisasi;
    }
    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }
    public String periksa(Pasien pasien) {
    return "Pasien " + pasien.getNama() + " (" + pasien.getKeluhan() + ")\n" +
           "-> Diberi resep obat & istirahat oleh " + spesialisasi;
    }
}
