package java8;

public class MethodRefToStatic {
    public static void main(String[] args) {
//        MethodRefToStatic obj=new MethodRefToStatic();
        MyInterface5 myInterface5=MethodRefToStatic::display;
        myInterface5.show();
    }
    public static void display(){
        System.out.println("in static display");
    }
}
interface MyInterface5{
    void show();
}
