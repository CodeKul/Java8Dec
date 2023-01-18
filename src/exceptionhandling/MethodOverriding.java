package exceptionhandling;

 public class MethodOverriding {

    public void show() throws Exception{

        System.out.println("in parent show method");
    }
}
class Child extends MethodOverriding{

    public void show() throws ArithmeticException{

        System.out.println("in parent show method");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
