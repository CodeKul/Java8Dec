package java8;

public class LambdaExpression  {
    public static void main(String[] args) {
        MyInterface1 obj=()-> {
            System.out.println("Hello world");
        };
        obj.add();

        MyInterface2 obj1=( a, b) ->{
                return a+b;
        };
        System.out.println(obj1.add(3,4));

        MyInterface3 obj3=(a) ->{
                return "This is String";
        };
        System.out.println(obj3.show(5));
    }
}
@FunctionalInterface
interface  MyInterface1{
    void add();
}
@FunctionalInterface
interface  MyInterface2{
    int add(int a,int b);
}
@FunctionalInterface
interface  MyInterface3{
    String show(int a);
}

