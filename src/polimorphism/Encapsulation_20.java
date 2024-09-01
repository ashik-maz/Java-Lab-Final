package polimorphism;
class Area{
    int length,breadth;
    Area(int length, int breadth){
        this.breadth=breadth;
        this.length=length;
    }
    void getArea(){
        int area=length*breadth;
        System.out.println("Area="+area);
    }
}
public class Encapsulation_20 {
    public static void main(String[] args) {
        Area room=new Area(10,20);
        room.getArea();
    }
}
