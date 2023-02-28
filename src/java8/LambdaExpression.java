package java8;

public class LambdaExpression  {
    public static void main(String[] args) {
        MyInterface1 obj=()-> {
            System.out.println("in add method");
        };
        obj.add();
    }



}
@FunctionalInterface
interface  MyInterface1{
    void add();
}


