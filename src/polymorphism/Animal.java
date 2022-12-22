package polymorphism;
/*
polymorphism--taking multiple forms of single thing
method overloading--
--method name is same but parameters may be different

method overriding
----method name is same but parameters may be similar
--allows to implement parent method
--method signature is similar in parent as well as child
 */
public class Animal {
    public void sound(){  //method signature
        System.out.println("animal sound");
    }
}


class Cat extends Animal{
    public void sound(){
        System.out.println("cat sound");
    }


    public static void main(String[] args) {
        Cat obj=new Cat();
        obj.sound();
    }


}

class Dog extends Animal{
    public void sound(){
        System.out.println("dog sound");
    }


    public static void main(String[] args) {
        Dog obj1=new Dog();
        obj1.sound();
    }


}