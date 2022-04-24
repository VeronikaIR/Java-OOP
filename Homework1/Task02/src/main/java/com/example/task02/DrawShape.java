package com.example.task02;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class DrawShape extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group group = new Group();
        Scene scene = new Scene(group, 600, 500);
        stage.setTitle("Draw ");

        double width = scene.getWidth();
        double height = scene.getHeight();

        double difference = width / height;
        double space = 20;

        for (int i = 0; i <= height; i += space) {
            drawLine(group, 0, i, difference * i, height);
        }

        for (int i = 0; i <= height; i += space) {
            drawLine(group, width, i, width - difference * i, height);
        }

        for (double i = height; i >= 0; i -= space) {
            drawLine(group, 0, i, width - difference * i, 0);
        }

        for (double i = height; i >= 0; i -= space) {
            drawLine(group, width, i, difference * i, 0);
        }

        stage.setScene(scene);
        stage.show();
    }

    public static void drawLine(Group group, double xStart, double yStart, double xEnd, double yEnd) {
        Line line = new Line(xStart, yStart, xEnd, yEnd);
        line.setStroke(Color.ORANGE);
        line.setStrokeWidth(0.9);
        group.getChildren().add(line);
    }


    public static void main(String[] args) {
        launch();
    }
}