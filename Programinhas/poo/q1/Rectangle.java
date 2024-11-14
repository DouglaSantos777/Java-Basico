package poo.q1;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double Area(){
        return width * height;
    }

    public double Perimeter(){
        return width * 2 + height * 2;
    }

    public double Diagonal(){
        double sizes = Math.pow(width,2) + Math.pow(height,2);
        double d = Math.sqrt(sizes);

        return d;
    }
}
