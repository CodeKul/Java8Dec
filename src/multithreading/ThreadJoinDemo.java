package multithreading;
class Thread4 extends Thread{
    int i=0;
    @Override
    public void run() {
        while(i<20){
            System.out.println(Thread.currentThread().getName());
            i++;
        }    } }
public class ThreadJoinDemo {
    public static void main(String[] args) {
        Thread4 th1=new Thread4();
        Thread4 th2=new Thread4();
        Thread4 th3=new Thread4();

        th1.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th2.start();
//        try {
//            th2.join();
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
        th3.start();
//        try {
//            th2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }


}
