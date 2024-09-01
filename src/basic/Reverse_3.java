package basic;

import java.util.Scanner;

public class Reverse_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=input.nextInt();
        while(num != 0){
            int m=num%10;
            num=num/10;
            System.out.print(m);
        }
    }
}
