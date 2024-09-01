package object_oriented;

import java.util.Scanner;

public class EvenOdd_12 {
    int num;
    Scanner input=new Scanner(System.in);
    void setInput(){
        System.out.println("Enter the number");
        num=input.nextInt();
    }
    void checkNumber(){
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void main(String[] args) {
        EvenOdd_12 obj=new EvenOdd_12();
        obj.setInput();
        obj.checkNumber();
    }


}
