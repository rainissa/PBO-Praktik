package id.ac.polban.service;

import id.ac.polban.model.Dokter;
import id.ac.polban.model.Pasien;
import java.util.ArrayList;
import java.util.List;

public class RumahSakitService {
    private final List<Pasien> daftarPasien;
    private final List<Dokter> daftarDokter;

    public RumahSakitService(){
        this.daftarPasien = new ArrayList<>();
        this.daftarDokter = new ArrayList<>();
    }
    public void daftarkanPasien(Pasien pasien){
        daftarPasien.add(pasien);
        System.out.println(pasien.getNama()+" berhasil didaftarkan sebagai pasien.");
    }
    public void daftarkanDokter(Dokter dokter){
        daftarDokter.add(dokter);
        System.out.println(dokter.getNamaDokter()+" berhasil didaftarkan sebagai dokter.");
    }
    public List<Pasien> getDaftarPasien(){
        return daftarPasien;
    }
    public List<Dokter> getDaftarDokter(){
        return daftarDokter;
    }
    public void konsultasi(Pasien pasien, Dokter dokter) {
        System.out.println(pasien.getNama() + " mendaftar untuk diperiksa oleh " + dokter.getNamaDokter());
        String hasil = dokter.periksa(pasien);
        System.out.println("Hasil diagnosis: " + hasil);
    }
}