package Treadding;

public class MainThread {
    public static void main(String[] args) {
        Thread t= Thread.currentThread();
        System.out.println("Curent Thread: "+t);

        //changed current Thread name
        t.setName("My Thread");
        System.out.println("After Chnaged: "+t);

        for(int n=10;n>0;n--){
            System.out.println(n);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main Thread interrupted");
            }
        }
    }
}
