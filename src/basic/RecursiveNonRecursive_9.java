package basic;

import java.util.Scanner;

public class RecursiveNonRecursive_9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Non Negative Number");
        int n=input.nextInt();

        if(n<0) System.out.println("Factorial is not defined");
        else {

            long facRec=calculateRec(n);
            long facNonRec=calculateNonRec(n);

            System.out.println("Factorial of "+n+" is "+ facRec);
            System.out.println("Factorial of "+n+" is "+ facNonRec);
        }
        input.close();
    }
    public  static long calculateRec(int n){
        if (n==0 || n==1)
            return 1;
        else{
            return n*calculateRec(n-1);
        }
    }

    public  static long calculateNonRec(int n){
        if (n==0 || n==1)
            return 1;
        else{
            long factorial=1;
            for(int i=2;i<=n;i++){
                factorial*=i;
            }
            return factorial;
        }
    }

}


