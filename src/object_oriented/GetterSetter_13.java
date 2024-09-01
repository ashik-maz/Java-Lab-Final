package object_oriented;

public class GetterSetter_13 {
    String name;
    int roll;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }



    void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll:"+roll);
    }

    public static void main(String[] args) {
        GetterSetter_13 student=new GetterSetter_13();
        student.setName("Ashik");
        student.setRoll(220119);
        student.display();
    }


}
