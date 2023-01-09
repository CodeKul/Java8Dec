package finaldemo;

 public class FinalDemo {
// final public class FinalDemo {
    final int i=1;
    final String name;  //blank final variable without intialization
     final static String address;

    public FinalDemo() {
        name="abc";
    }
    static {
        address="pune";
    }
    final void show(){
        System.out.println("in show method");
    }
    public static void main(String[] args) {
        FinalDemo obj =new FinalDemo();
       obj.show();
//       obj.name="abc";//compile time error because of final
//       obj.address="pune";

    }
}

class Child1 extends FinalDemo{
//    void show(){
//        System.out.println("in child show method");
//    }  ////compile time error because show method declared as final
    void show1(){
        System.out.println("in show1 method");
    }

    public static void main(String[] args) {
        Child1 obj2=new Child1();
        obj2.show1();
        obj2.show();
    }

}

