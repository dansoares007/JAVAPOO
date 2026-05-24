package trabalho_dupla;

public class Rectangle {
    private double width, height;

    public void setWidth(double w){
        width = w;
    }

    public void setHeight(double h){
        height = h;
    }
    
    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2*(width + height);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public String toString(){
        return String.format("Width = %.2f, Height = %.2f", width, height);
    }

}
