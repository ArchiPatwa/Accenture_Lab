interface Shape{
    void findArea();
}
class Rectangle implements Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
        this.length=length;
        this.breadth = breadth;
    }

    @Override
    public void findArea() {
        double area = length*breadth;
        System.out.println("The area of rectablge is :"+area);
    }
}
class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void findArea() {
        double area = Math.PI*radius*radius;
        System.out.println("The area of circle :"+area);
    }
}
public class FindArea {
   public static void main(String[] args){
       Shape rectangle = new Rectangle(5,4);
       rectangle.findArea();
       Shape circle = new Circle(20);
       circle.findArea();
   }
}
