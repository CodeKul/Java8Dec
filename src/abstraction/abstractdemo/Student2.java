package abstraction.abstractdemo;

public class Student2 extends AbstractDemo{
    @Override
    public void play() {
        System.out.println("student2 is playing");
    }

    @Override
    public void exercise() {

    }

    public static void main(String[] args) {
        Student2 obj1=new Student2();
        obj1.show();
        obj1.play();
    }
}
