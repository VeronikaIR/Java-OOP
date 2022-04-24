module com.example.week8problem1fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week8problem1fx to javafx.fxml;
    exports com.example.week8problem1fx;
}