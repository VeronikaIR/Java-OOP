module com.example.problem2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.problem2 to javafx.fxml;
    exports com.example.problem2;
}