module com.example.problem3week8fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.problem3week8fx to javafx.fxml;
    exports com.example.problem3week8fx;
}