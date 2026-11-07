package kelas.model;

import java.util.ArrayList;
import java.util.List;

public class Produk {
    private String kode;
    private String nama;
    private String kategori;
    private double harga;
    private List<String> daftarGambarUri;

    public Produk(String kode, String nama, String kategori, double harga, List<String> daftarGambarUri) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama produk tidak boleh kosong!");
        }
        if (harga <= 0) {
            throw new IllegalArgumentException("Harga produk harus lebih besar dari 0!");
        }

        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.daftarGambarUri = daftarGambarUri != null ? daftarGambarUri : new ArrayList<>();
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public double getHarga() {
        return harga;
    }

    public List<String> getDaftarGambarUri() {
        return daftarGambarUri;
    }
}