package java8;

public class DefaultAndStatic implements Interface1{

    public static void main(String[] args) {
        DefaultAndStatic obj=new DefaultAndStatic();
        obj.show();
        System.out.println(obj.add(2,3));
        obj.add1(4,5);
        Interface1.msg();
    }
    @Override
    public int add(int a, int b) {
        return a+b;
    }

//    @Override
//    public void add1(int a, int b) {
//        System.out.println("Addition of a and b: "+(a+b));
//    }
    @Override
    public void show() {
        System.out.println("in show method");
    }
}

interface Interface1{
    int add(int a,int b);
    void show();
    default void add1(int a, int b) {
        System.out.println("addition: "+(a+b));
    }
    static void msg(){
        System.out.println("in msg method");
    }
}


