package basic;

import java.util.Scanner;

public class GCD_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Two Number");
        int num1=input.nextInt();
        int num2= input.nextInt();
        System.out.println("GCD="+GCD(num1,num2));
    }
    static int GCD(int x,int y){
        int r=0,a,b;
        a=(x>y)?x:y;
        b=(x<y)?x:y;
        r=b;

        while(a%b !=0){
            r=a%b;
            a=b;
            b=r;
        }

        return r;
    }
}
