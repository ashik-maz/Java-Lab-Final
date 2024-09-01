package Inheritance;

abstract class subject{
    subject(){
        System.out.println("Learning Subject");
    }
    abstract  void syllebus();
}
class cse extends subject{

    @Override
    void syllebus() {
        System.out.println("c,c++,java");
    }
}
public class AbstractClass_17 {
    public static void main(String[] args) {
        cse s1=new cse();
        s1.syllebus();
    }
}
