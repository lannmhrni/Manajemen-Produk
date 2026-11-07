package kelas.main;

import javafx.application.Application;
import javafx.stage.Stage;
import kelas.main.Navigator;
import kelas.data.DataProduk;

public class Toko extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        new Navigator(stage, new DataProduk()).bukaForm();
    }

    public static void main(String[] args) {
        launch(args);
    }
}