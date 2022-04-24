package com.example.problem2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class DrawFigure extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group group = new Group();
        Scene scene = new Scene(group, 300, 300);

        double startX = scene.getWidth() / 2;
        double startY = scene.getHeight() / 2;

        int lineIncrease = 1;
        int lineLength = 20;

        for(int i = 1; i < 6; i++){

            Line line1 = new Line(startX, startY, startX, startY + (lineLength * lineIncrease));
            group.getChildren().add(configureLine(line1));
            startY += lineLength * lineIncrease;
            Line line2 = new Line(startX, startY, startX - (lineLength * lineIncrease), startY);
            group.getChildren().add(configureLine(line2));
            startX -= lineLength * lineIncrease;
            lineIncrease++;
            Line line3 = new Line(startX, startY, startX, startY - (lineLength * lineIncrease));
            group.getChildren().add(configureLine(line3));
            startY -= lineLength * lineIncrease;
            Line line4 = new Line(startX, startY, startX + (lineLength * lineIncrease), startY);
            group.getChildren().add(configureLine(line4));
            startX += (lineLength * lineIncrease);
            lineIncrease++;
        }


        stage.setTitle("Figure");
        stage.setScene(scene);
        stage.show();
    }

    private Line configureLine(Line line){

        line.setStroke(Color.RED);
        line.setStrokeWidth(1);
        return line;
    }

    public static void main(String[] args) {
        launch();
    }
}