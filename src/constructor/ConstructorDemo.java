package constructor;
/*
Constructor is a method which is automatically invoked/call
when object of a class is created

types--1. default constructor
        2.parameter constructor

  rules
  1.Constructor name and class name must be similar
  2.Constructor should be written in pascal notation
  3. it does not have return type
 */
public class ConstructorDemo {

    public ConstructorDemo(){    //deafult constructor
        System.out.println("in constructor");
    }
    public ConstructorDemo(int i){    //parameter constructor
        System.out.println("in parameter constructor");
    }
    public ConstructorDemo(int i,int j){    //parameter constructor
        System.out.println("in 2 parameter constructor");
    }

    public  void show(){
        System.out.println("in show");
    }

    public static void main(String[] args) {
        ConstructorDemo obj=new ConstructorDemo(7,8);
        obj.show();
    }

}
