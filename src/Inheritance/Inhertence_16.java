package Inheritance;

import java.util.Scanner;
class Fruit{

    float unitprice;
    int quantity;
    float totalcoast(){
        return  quantity*unitprice;
    }
    void readdata(){
        Scanner input=new Scanner(System.in);
        unitprice=input.nextFloat();
        quantity=input.nextInt();
    }
    void display(){
        System.out.println("Total Coast="+totalcoast());
    }
}
class mango extends Fruit{
    String name,taste;
    mango(String name,String taste){
        this.name=name;
        this.taste=taste;

    }
}
public class Inhertence_16 {
    public static void main(String[] args) {
        mango lengra=new mango("lenra","delicious");
        lengra.readdata();
        lengra.totalcoast();
        lengra.display();
    }
}
