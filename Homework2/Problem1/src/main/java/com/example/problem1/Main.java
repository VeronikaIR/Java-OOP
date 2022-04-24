package com.example.problem1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Optional;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws IOException {

        Group group = new Group();
        Scene scene = new Scene(group, 400, 200);
        int inputMonth = readMonth();
        int inputYear = readYear();
        createCalendar(inputMonth, inputYear, group);

        stage.setTitle(String.format("Calendar for the %s %d", Month.of(inputMonth).getDisplayName(TextStyle.FULL, Locale.ENGLISH), inputYear));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private int readMonth() {

        TextInputDialog monthDlg = new TextInputDialog();
        monthDlg.setContentText("Enter month: ");
        monthDlg.setHeaderText(null);
        int month;
        Optional<String> monthGet = monthDlg.showAndWait();
        try {
            month = Integer.parseInt(monthGet.get());
            if (month < 0 || month > 12) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Warning!");
                //if the entered month is invalid then set January for a month by default
                alert.setHeaderText("Invalid month! (Month is January by default)");
                month = 1;
                alert.showAndWait();
            }
        } catch (NumberFormatException e) {
            //when input is not an integer
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            //if the entered month is invalid then set January for a month by default
            alert.setHeaderText("Invalid month! (Month is January by default)");
            month = 1;
            alert.showAndWait();
        }
        return month;
    }

    private int readYear() {

        TextInputDialog yearDlg = new TextInputDialog();
        yearDlg.setContentText("Enter year: ");
        yearDlg.setHeaderText(null);
        int year;
        Optional<String> yearGet = yearDlg.showAndWait();
        try {
            year = Integer.parseInt(yearGet.get());
            if (year < 1) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Warning!");
                //if the entered year is invalid then set 2022 for a year by default
                alert.setHeaderText("Invalid year! (Year is 2022 by default)");
                year = 2022;
                alert.showAndWait();
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Warning!");
            //if the entered year is invalid then set 2022 for a year by default
            alert.setHeaderText("Invalid year! (Year is 2022 by default)");
            year = 2022;
            alert.showAndWait();
        }
        return year;
    }

    private void createCalendar(int month, int year, Group group) {

        int startDay = LocalDate.of(year, month, 1).getDayOfWeek().getValue();

        for (int i = 1; i <= 7; i++) {
            String dayOfWeek = DayOfWeek.of(i).getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase(Locale.ROOT);
            Text text = new Text((i * 50), 15, dayOfWeek);
            group.getChildren().add(text);
        }
        int daysInMonth = Month.of(month).length(Year.isLeap(year));
        int weeks = 2;
        boolean flag = false;

        for (int i = 1; i <= daysInMonth; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j != startDay && !flag) {
                    continue;
                } else {
                    Text curDate = new Text(j * 50, weeks * 20, Integer.toString(i));
                    if (i == LocalDate.now().getDayOfMonth() && Month.of(month).getValue() == LocalDate.now().getMonthValue() && Year.now().getValue() == year) {
                        curDate.setStroke(Color.RED);
                    }
                    group.getChildren().add(curDate);
                    flag = true;
                    if (i < daysInMonth && j != 7) {
                        i++;
                    } else {
                        break;
                    }
                }
            }
            weeks++;
        }
    }
}


