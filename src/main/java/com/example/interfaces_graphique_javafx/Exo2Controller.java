package com.example.interfaces_graphique_javafx;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Exo2Controller implements Initializable {
    @FXML
    private TableView Table;
    @FXML
    private TableColumn CodeValue;
    @FXML
    private TableColumn AlternateName;
    @FXML
    private TableColumn CountryGroup;
    @FXML
    private TableColumn NameEN;
    @FXML
    private TableColumn NameFR;
    @FXML
    private TableColumn NameDE;
    @FXML
    private TableColumn Latitude;
    @FXML
    private TableColumn Longitude;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CodeValue.setCellValueFactory(new PropertyValueFactory<Pays, String>("CodeValue"));
        AlternateName.setCellValueFactory(new PropertyValueFactory<Pays, String>("AlternateName"));
        CountryGroup.setCellValueFactory(new PropertyValueFactory<Pays, String>("CountryGroup"));
        NameEN.setCellValueFactory(new PropertyValueFactory<Pays, String>("NameEN"));
        NameFR.setCellValueFactory(new PropertyValueFactory<Pays, String>("NameFR"));
        NameDE.setCellValueFactory(new PropertyValueFactory<Pays, String>("NameDE"));
        Latitude.setCellValueFactory(new PropertyValueFactory<Pays, String>("Latitude"));
        Longitude.setCellValueFactory(new PropertyValueFactory<Pays, String>("Longitude"));

        List<List<String>> csv = getCsv();
        for(int i = 1; i<csv.size(); i++) {
            Pays pays = new Pays(csv.get(i).get(0), csv.get(i).get(1), csv.get(i).get(2), csv.get(i).get(3), csv.get(i).get(4), csv.get(i).get(5), csv.get(i).get(6), csv.get(i).get(7));
            ObservableList<Pays> payss = Table.getItems();
            payss.add(pays);
            Table.setItems(payss);
        }
    }

    public List<List<String>> getCsv() {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("pays.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
            return records;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}