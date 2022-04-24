package shape;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle.setColor("yellow");

        Scanner input = new Scanner(System.in);
        System.out.print("Input width: ");
        double width = input.nextDouble();
        System.out.print("Input height: ");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle);
        System.out.println("Area:" + rectangle.getArea());
        System.out.println("Perimeter: "+ rectangle.getPerimeter());

        Rectangle.setColor("red");
    }

}
