package multithreading;

class Thread5 extends Thread{
  public void run(){
      Thread.yield();
      for(int i=0;i<5;i++){
          System.out.println("in run method");
      }
  }

}
public class YeildDemo {
    public static void main(String[] args) {
        Thread5 th=new Thread5();
        th.start();

        for (int i=0;i<5;i++){
            System.out.println("in main method");
        }
    }
}
