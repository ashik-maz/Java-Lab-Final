package Threads;

class multitreadding extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }

}
public class MultipleTreads_21 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            multitreadding obj= new multitreadding();
            obj.start();
        }
    }
}
