public class RumahSakitTest {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("       SISTEM INFORMASI RUMAH SAKIT      ");
        System.out.println("=========================================");

        Dokter dokter1 = new Dokter("dr. Tirta", 
        "Dokter Umum");
        Pasien pasien1 = new Pasien("Rainissa Azizah", 
            "RM-001", 20, 
            "demam dan pusing");
        
        System.out.println("\n--- Data Awal Pasien ---");
        System.out.println("Nama           : " 
            + pasien1.getNama());
        System.out.println("No. Rekam Medis: " 
            + pasien1.getNoRekamMedis());
        System.out.println("Umur           : " 
            + pasien1.getUmur() + " tahun");
        System.out.println("Keluhan        : " 
            + pasien1.getKeluhan());

        System.out.println("\n--- Uji Coba Validasi Setter Umur ---");
        pasien1.setUmur(-5); // percobaan input tidak valid
        pasien1.setUmur(21); // percobaan input valid
        System.out.println("Umur sesudah : " + pasien1.getUmur() 
            + " tahun");

        System.out.println("\n--- Proses Konsultasi Pasien ---");
        pasien1.konsultasi(dokter1);

        System.out.println("\n=======================================");
        System.out.println("                 SELESAI                 ");
        System.out.println("=========================================");
    }
}