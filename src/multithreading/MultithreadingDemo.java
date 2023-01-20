package multithreading;

//2 ways to create threads
//1.extending Thread class
//2.Implementing Runnable Interface

class MyThread1 extends Thread{
    @Override

        public void run() {
        int i=0;
        while(i<20000){
            System.out.println("I am in thread 1");
            i++;
        }
    }

}
class MyThread2 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<20000){
            System.out.println("I am in thread 2");
            i++;
        }
}}

public class MultithreadingDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }

}
