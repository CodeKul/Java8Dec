package abstraction.abstractdemo;

public class Student1 extends AbstractDemo{
    @Override
    public void play() {
        System.out.println("student1 is playing");

    }

    @Override
    public void exercise() {

    }

    public static void main(String[] args) {
        Student1 obj1=new Student1();
        obj1.show();
        obj1.play();
    }
}
