package inheritance;

import java.util.regex.MatchResult;
//




public class Teacher {
    public void show(){
        System.out.println("in teacher class");
    }

    public static void main(String[] args) {
        MathsTeacher obj2=new MathsTeacher();
        obj2.show();
    }
}

class MathsTeacher extends PhysicsTeacher{

    public void show(){
        System.out.println("in Maths Teacher class");
    }

    public static void main(String[] args) {
        MathsTeacher obj1=new MathsTeacher();
        obj1.show();
        Teacher obj2=new Teacher();
        obj2.show();
//        PhysicsTeacher obj2=new PhysicsTeacher();
//        obj2.show();
    }

}

class PhysicsTeacher extends Teacher{
    public void show(){
        System.out.println("in Physics Teacher class");
    }
}
class ChemsitryTeacher extends Teacher{

}