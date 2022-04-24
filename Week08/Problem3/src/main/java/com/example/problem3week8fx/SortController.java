package com.example.problem3week8fx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SortController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnQuit;

    @FXML
    private Button btnSort;

    @FXML
    private Label lblOrded;

    @FXML
    private Label lblSorted;

    @FXML
    private Label lblUnsorted;

    @FXML
    private TextArea txaOrder;

    @FXML
    private TextField txaSotrded;

    @FXML
    private TextArea txaUsorted;

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnSortOnAction(ActionEvent event) {
String usorted = txaUsorted.getText();
String[] array = usorted.split("\\s+");
    }

    @FXML
    void initialize() {
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'SortView.fxml'.";
        assert btnSort != null : "fx:id=\"btnSort\" was not injected: check your FXML file 'SortView.fxml'.";
        assert lblOrded != null : "fx:id=\"lblOrded\" was not injected: check your FXML file 'SortView.fxml'.";
        assert lblSorted != null : "fx:id=\"lblSorted\" was not injected: check your FXML file 'SortView.fxml'.";
        assert lblUnsorted != null : "fx:id=\"lblUnsorted\" was not injected: check your FXML file 'SortView.fxml'.";
        assert txaOrder != null : "fx:id=\"txaOrder\" was not injected: check your FXML file 'SortView.fxml'.";
        assert txaSotrded != null : "fx:id=\"txaSotrded\" was not injected: check your FXML file 'SortView.fxml'.";
        assert txaUsorted != null : "fx:id=\"txaUsorted\" was not injected: check your FXML file 'SortView.fxml'.";

    }

}
