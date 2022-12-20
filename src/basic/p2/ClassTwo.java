package basic.p2;

import basic.p1.ClassOne;

public class ClassTwo extends ClassOne {
    void display()
    {
        System.out.println("in display method");
    }
    public static void main(String[] args) {
        ClassTwo obj2=new ClassTwo();
        obj2.display();
        obj2.showMessage();

    }

}
