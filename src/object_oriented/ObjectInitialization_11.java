package object_oriented;

public class ObjectInitialization_11 {
    String name;
    String roll;
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll:"+roll);
    }

    public static void main(String[] args) {
        ObjectInitialization_11 obj=new ObjectInitialization_11();
        obj.name="Ashik";
        obj.roll="220119";
        obj.display();
    }
}
