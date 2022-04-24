module com.example.task02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task02 to javafx.fxml;
    exports com.example.task02;
}