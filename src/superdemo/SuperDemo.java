package superdemo;

public class SuperDemo {
    int i;
    public void show(){

            System.out.println("In parent show method");
    }
    }
class Child1 extends SuperDemo{
    int i=2;
    public  void show(){
        System.out.println(super.i);
        System.out.println("in child1 show method");
    }
}
class Child2 extends SuperDemo{
    int i=3;
    public  void show(){
        super.show();
        System.out.println(super.i);
        System.out.println("in child2 show method");
    }

    public static void main(String[] args) {
        Child2 obj=new Child2();
        obj.i=5;
        obj.show();
    }
}

