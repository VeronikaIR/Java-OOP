package problem6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class ListFridays {

    private static void printListOfAllFriday13 (int year){
        Locale bgLocal = new Locale("bg", "BG");
        Locale.setDefault(bgLocal);

        //format date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd yyyy");

        for(int i = 0; i < 12; i++){ //iterate months
            LocalDate date = LocalDate.of(year,i + 1, 13);

            if(date.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
                System.out.println(date);
            }
        }
    }

    public static void main(String[] args) {
        int year;
        Random random = new Random();

        // [1900 - 2020] -> [0 - 120] -> random.nextInt(121)
        year = random.nextInt(121) + 1900;
        System.out.println("All Friday 13ths in the year " + year);
        printListOfAllFriday13(year);
    }
}
