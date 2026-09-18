public class Pasien {
    private final String nama;
    private final String noRekamMedis;
    private int umur;
    private String keluhan;

    public Pasien(String nama, String noRekamMedis, int umur, 
        String keluhan) {
        this.nama = nama;
        this.noRekamMedis = noRekamMedis;
        this.umur = umur;
        this.keluhan = keluhan;
    }

    public String getNama() {
        return nama;
    }
    public String getNoRekamMedis() {
        return noRekamMedis;
    }
    public int getUmur() {
        return umur;
    }
    public String getKeluhan() {
        return keluhan;
    }
    public void setUmur(int umur) {
        if (umur > 0 && umur < 130) { 
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid, gagal diubah.");
        }
    }
    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }
    public void konsultasi(Dokter dokter) {
        System.out.println(nama + " mendaftar untuk diperiksa oleh " 
        + dokter.getNamaDokter());
        String hasil = dokter.periksa(this);
        System.out.println("Hasil diagnosis: " + hasil);
    }
}