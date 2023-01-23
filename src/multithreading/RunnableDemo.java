package multithreading;

class MyThread3 implements Runnable{

    @Override
    public void run() {
    int i=1;
    while (i<20000){
        System.out.println(" i am Thread 3");
        i++;
    }
    }
}
class MyThread4 implements Runnable{

    @Override
    public void run() {
        int i=1;
        while (i<20000){
            System.out.println(" i am Thread 4");
            i++;
        }
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        MyThread3 bullet1=new MyThread3();
        Thread gun1=new Thread(bullet1);
        MyThread4 bullet2=new MyThread4();
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();


    }
}
