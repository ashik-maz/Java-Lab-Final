package object_oriented;

public class Constructor_14 {
    String name;
    int roll;

    Constructor_14() {
        roll = 0;
        name = "";
    }

    Constructor_14(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Roll:" + roll);
    }

    public static void main(String[] args) {
        Constructor_14 student = new Constructor_14("Ashik", 220119);
        student.display();
    }
}
