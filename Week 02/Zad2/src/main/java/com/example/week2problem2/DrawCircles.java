package com.example.week2problem2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class DrawCircles extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group();
        Scene scene = new Scene(group, 400, 500);
        double width = scene.getWidth();
        double height = scene.getHeight();

        int radius = 10;
        double xCenter = width / 2;
        double yCenter = height / 2;

        int count = 1;
        while (count < 13) {

            Circle circle = new Circle(xCenter, yCenter, radius);
            circle.setStroke(Color.BLUE);
            circle.setFill(Color.TRANSPARENT);
            circle.setStrokeWidth(2);

            group.getChildren().add(circle); //return all elements and add new circle
            radius += 10;
            count++;
        }

        double xH = xCenter - 12 * 10;
        double yV = yCenter - 12 * 10;

        Line horizontalDiameter = new Line(xH, yCenter,xCenter + 12 * 10, yCenter );
        horizontalDiameter.setStroke(Color.RED);

        Line verticallDiameter = new Line(xCenter, yV,xCenter, yCenter  + 12 * 10 );
        horizontalDiameter.setStroke(Color.RED);

        group.getChildren().addAll(verticallDiameter,horizontalDiameter);


        stage.setTitle("Drawing!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}