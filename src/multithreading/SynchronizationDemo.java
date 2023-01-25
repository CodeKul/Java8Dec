package multithreading;

public class SynchronizationDemo {
    static int num=0;
    private void increment(){
        synchronized (SynchronizationDemo.class){
            num++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        SynchronizationDemo obj = new SynchronizationDemo();

        Thread t1 = new Thread(()->{

            for(int i=1;i<=1000;i++) {
                obj.increment();
            }
        });
        t1.start();
        Thread t2 = new Thread(()->{
            for(int i=1;i<=1000;i++) {
                obj.increment();

            }
        });
        t2.start();
        t1.join();
        t2.join();

        System.out.println(num);
    }

}
