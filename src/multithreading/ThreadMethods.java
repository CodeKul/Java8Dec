package multithreading;
class MyThread5 extends Thread{
    @Override

    public void run() {
        int i=0;
        while(i<100){
            System.out.println("I am in thread 5");
            i++;
        }
        System.out.println(Thread.currentThread().getState());
    }

}
class MyThread6 extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<100){
            System.out.println("I am in thread 6");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
        System.out.println(Thread.currentThread().getState());
    }}
public class ThreadMethods {
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5();
        System.out.println("before start:");
        System.out.println(t1.getState());
//        t1.setName("T1");
//        System.out.println(t1.getId());
//        System.out.println(t1.getName());
        MyThread6 t2 = new MyThread6();
//        t2.setName("T2");
//        System.out.println(t2.getId());
//        System.out.println(t2.getName());
        t1.start();
        System.out.println("after start:");
            System.out.println(t1.getState());
            System.out.println(t2.getState());
//              System.out.println(t1.getState());
        t2.start();

    }
}
