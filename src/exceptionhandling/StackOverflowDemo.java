package exceptionhandling;

public class StackOverflowDemo {
    public void recursive(int i){

        if(i==0){
            System.out.println("i is 0");
        }
        else {
            i--;
            System.out.println(i);
            recursive(i);

        }
    }

    public static void main(String[] args) {
        StackOverflowDemo obj=new StackOverflowDemo();
        obj.recursive(4);
    }
}
