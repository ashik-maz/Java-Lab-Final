package basic;

public class EnhanceForLoop_6 {
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5};
        System.out.println("Traditional For Loop");
        for(int i=0;i<5;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println("\nEnhanched For Loop");
        for(int num:numbers)
            System.out.print(num+" ");
        System.out.println();
    }

}
