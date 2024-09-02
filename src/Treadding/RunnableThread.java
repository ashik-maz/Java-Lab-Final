package Treadding;
class newThread implements Runnable{

    Thread t;
    int threadnum;
    newThread(int threadnum){
        t=new Thread(this,"Runnable Thread");
        this.threadnum=threadnum;
        t.start();
    }

    @Override
    public void run() {
        for(int n=10;n>0;n--){
            System.out.println(threadnum+"-child thread "+n);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Child Thread interrupted");
            }
        }

    }
}
public class RunnableThread {
    public static void main(String[] args) {
        new newThread(1);
        new newThread(2);

    }
}
