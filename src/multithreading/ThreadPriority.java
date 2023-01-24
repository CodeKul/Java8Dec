package multithreading;

class Thread1 extends Thread{

    int i=0;
    @Override
    public void run() {
        while(i<20){
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
            System.out.println("I am Thread1");
            i++;
        }    } }

class Thread2 extends Thread{
    int i=0;
    @Override
    public void run() {
        while(i<20){
            System.out.println("I am Thread2");
            i++;
        }    } }
class Thread3 extends Thread{
    int i=0;
    @Override
    public void run() {
        while(i<20){
            System.out.println("I am Thread3");

            i++;
        }
        Thread.currentThread().setName("Thread3");
        System.out.println(Thread.currentThread().getName());
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread1 t1=new Thread1();
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread2 t2=new Thread2();
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t2.isAlive());
        Thread3 t3=new Thread3();
        t1.start();


        t2.start();
        System.out.println(t2.isAlive());

        System.out.println(t2.isDaemon());
  t3.start();
        System.out.println(t2.isAlive());
    }
}
