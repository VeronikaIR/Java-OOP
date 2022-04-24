package com.example.week06problem1;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GcdController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCompute;

    @FXML
    private Button btnQuit;

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtB;

    @FXML
    private TextField txtGCD;

    @FXML
    void btnComputeOnAction(ActionEvent event) {

        int a = Integer.parseInt(txtA.getText());
        int b = Integer.parseInt(txtB.getText());
        txtGCD.setText(String.format("%d", computeGcd(a, b)));


    }

    private int computeGcd(int a, int b){
        if(b == 0){
            return a;
        }
        return computeGcd(b, a % b);
    }

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    void initialize() {
        assert btnCompute != null : "fx:id=\"btnCompute\" was not injected: check your FXML file 'gcd-view.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'gcd-view.fxml'.";
        assert txtA != null : "fx:id=\"txtA\" was not injected: check your FXML file 'gcd-view.fxml'.";
        assert txtB != null : "fx:id=\"txtB\" was not injected: check your FXML file 'gcd-view.fxml'.";
        assert txtGCD != null : "fx:id=\"txtGCD\" was not injected: check your FXML file 'gcd-view.fxml'.";

    }

}
