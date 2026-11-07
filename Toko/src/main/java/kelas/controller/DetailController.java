package kelas.controller;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import kelas.main.Navigator;
import kelas.model.Produk;

public class DetailController {

    @FXML private Label kodeLabel, namaLabel, kategoriLabel, hargaLabel, pesanLabel;
    @FXML private VBox gambarContainerVBox;
    private Navigator navigator;

    public void setData(Navigator navigator, Produk p) {
        this.navigator = navigator;
        kodeLabel.setText(p.getKode());
        namaLabel.setText(p.getNama());
        kategoriLabel.setText(p.getKategori());
        hargaLabel.setText(NumberFormat.getCurrencyInstance(Locale.forLanguageTag("id-ID")).format(p.getHarga()));

        // Membersihkan wadah gambar terlebih dahulu
        if (gambarContainerVBox != null) {
            gambarContainerVBox.getChildren().clear();
            
            // Melakukan Looping untuk menampilkan semua foto yang dipilih
            if (p.getDaftarGambarUri() != null && !p.getDaftarGambarUri().isEmpty()) {
                for (String uri : p.getDaftarGambarUri()) {
                    ImageView imgView = new ImageView(new Image(uri, 320, 220, true, true));
                    imgView.setPreserveRatio(true);
                    gambarContainerVBox.getChildren().add(imgView);
                }
                pesanLabel.setText("");
            } else {
                pesanLabel.setText("Tanpa lampiran gambar.");
            }
        }
    }

    @FXML
    private void tambahLagi() {
        try {
            navigator.bukaForm();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void bukaDaftar() {
        try {
            navigator.bukaDaftar();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}