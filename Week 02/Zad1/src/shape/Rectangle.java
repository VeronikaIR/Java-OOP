package shape;

public class Rectangle {
    private double width;
    private double height;
    private static String color;

    public Rectangle() {
        this(1,0);
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0){
            this.width = width;
        }
        else{
            this.width = 1;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String color) {
        if(color == null){
            Rectangle.color = "yellow";
        }else{
            Rectangle.color = color;
        }
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    @Override
    public String toString(){
        return String.format("Width: %f, " + "Height: %f, Color: %s",
                width,height,color);
    }



}
