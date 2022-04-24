package geometry;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Rectangle {

    private Point uPoint;
    private double width;
    private double height;

    public Rectangle(Point uPoint,double width, double height) {
        setuPoint(uPoint);
        setWidth(width);
      setHeight(height);
    }

    public Rectangle(){
        this(new Point(),5,10);

    }

    public Rectangle(Rectangle r){
        this(r.getuPoint(), r.width, r.height);
    }

    public void draw(Group pane){
        javafx.scene.shape.Rectangle rectangle = new javafx.scene.shape.Rectangle(
                uPoint.getCoords()[0], uPoint.getCoords()[1], width ,height);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(null);  // not filled

        pane.getChildren().add(rectangle);
    }


    public Point getuPoint() {
        return new Point();
    }

    public void setuPoint(Point uPoint) {
        if(uPoint == null){
            this.uPoint = new Point();
        }else{
            this.uPoint = new Point(uPoint);
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0){
            this.width = width;
        }
        else{
            this.width = 5;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0){
            this.height = height;
        }
        else{
            this.height = 10;
        }
    }

    @Override
    public String toString() {
        return String.format("Upper left point: %s," +"width: %.2f, height: %.2f\n", uPoint.toString(),width,height);
    }
}
