import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class RandomNumber{


    public static void countAndCalculatePercentage(int times){

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        Random rand = new Random();

        for(int i = 0; i < times; i++){

            double number = rand.nextDouble();

            if(number <= 0.2){
                count1++;
                continue;
            }
            else if(number <= 0.5){
                count2++;
                continue;
            }
           count3++;
        }

    double probabilityOfOne = (double)count1 / times;
    double probabilityOfTwo = (double)count2 / times;
    double probabilityOfThree = (double)count3 / times;

    NumberFormat numberFormat = NumberFormat.getPercentInstance();
    numberFormat.setMinimumFractionDigits(2);

    System.out.println("P(1) = " + numberFormat.format(probabilityOfOne));
    System.out.println("P(2) = " + numberFormat.format(probabilityOfTwo));
    System.out.println("P(3) = " + numberFormat.format(probabilityOfThree));
    }

    class Automobile{
        private String drive(){
            return "Driving vehicle";
        }
    }

    class Car extends Automobile{
        protected String drive(){
            return "Driving car";
        }
    }

    public class ElectricCar extends Car{

        @Override
        public final String drive(){
            return "Driving electric car";
        }
    }

    public static void main(String[] args) {

        final Car car = new ElectricCar();
        System.out.println(car.drive());

    }
}
