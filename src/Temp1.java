import java.util.Scanner;

public class Temp1 {
    static int num=0;

    private void increase(){
        synchronized (Temp1.class) {
            num++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Temp1 obj = new Temp1();

        Thread t1 = new Thread(()->{
            for(int i=1;i<=1000;i++) {
                obj.increase();
            }
        });

        t1.start();

        Thread t2 = new Thread(()->{
            for(int i=1;i<=1000;i++) {
                obj.increase();

            }
        });

        t2.start();

        t1.join();
        t2.join();
        System.out.println(num);
    }
}
