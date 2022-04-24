module com.example.week06problem1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week06problem1 to javafx.fxml;
    exports com.example.week06problem1;
}