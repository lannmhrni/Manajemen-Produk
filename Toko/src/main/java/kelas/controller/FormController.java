package kelas.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import kelas.main.Navigator;
import kelas.data.DataProduk;
import kelas.model.Produk;

public class FormController {

    @FXML private TextField namaField, hargaField;
    @FXML private ComboBox<String> kategoriBox;
    @FXML private Label pesanLabel;
    
    private Navigator navigator;
    private DataProduk data;
    private final List<String> listGambarUri = new ArrayList<>();

    @FXML
    private void initialize() {
        kategoriBox.getItems().addAll("Makanan", "Minuman");
        kategoriBox.setValue("Makanan");
    }

    public void setKonteks(Navigator navigator, DataProduk data) {
        this.navigator = navigator;
        this.data = data;
    }

    @FXML
    private void pilihGambar() {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Pilih Lampiran Gambar Produk (Opsional)");
        chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Gambar PNG/JPEG", "*.png", "*.jpg", "*.jpeg"));
        
        List<File> files = chooser.showOpenMultipleDialog(namaField.getScene().getWindow());
        if (files == null || files.isEmpty()) {
            return;
        }

        for (File file : files) {
            if (file.length() > 5L * 1024 * 1024) {
                pesanLabel.setText("Salah satu gambar melebihi maksimum 5 MB.");
                continue;
            }
            listGambarUri.add(file.toURI().toString());
        }
        pesanLabel.setText(listGambarUri.size() + " gambar dipilih.");
    }

    @FXML
    private void simpan() {
        try {
            double harga = Double.parseDouble(hargaField.getText().trim());
            String nama = namaField.getText();
            String kategori = kategoriBox.getValue();

            Produk p = data.tambah(nama, kategori, harga, listGambarUri);
            navigator.bukaDetail(p);
        } catch (NumberFormatException e) {
            pesanLabel.setText("Harga harus berupa angka yang valid.");
        } catch (IllegalArgumentException e) {
            pesanLabel.setText(e.getMessage());
        } catch (IOException e) {
            pesanLabel.setText("Gagal membuka halaman detail.");
            e.printStackTrace();
        }
    }

    @FXML
    private void bukaDaftar() {
        try {
            navigator.bukaDaftar();
        } catch (IOException e) {
            pesanLabel.setText("Gagal membuka daftar.");
        }
    }
}