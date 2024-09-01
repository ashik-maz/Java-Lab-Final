package object_oriented;

public class Overloadding_15 {
    int m(int x,int y){
        return x+y;
    }
    double m(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {
        Overloadding_15 obj1=new Overloadding_15();
        int x= obj1.m(10,20);
        System.out.println(x);
        double y=obj1.m(12.0,13.0);
        System.out.println(y);
    }
}
