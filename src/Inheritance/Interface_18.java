package Inheritance;

interface Shape{
    void draw();
    double area();
}
abstract  class AbsShape implements  Shape{
    @Override
    public abstract void draw();
    @Override
    public  abstract  double area();
}
class circle extends AbsShape{
    double pi=3.14;
    double radius;
    circle(double radius){
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle Drawn");

    }

    @Override
    public double area() {
        return pi*radius*radius;
    }
}

public class Interface_18 {
    public static void main(String[] args) {
        Shape circle=new circle(5);
        circle.draw();
        System.out.println("Area="+circle.area());
    }

}
