package java8;

public class MethodRefToConstructor {
    public MethodRefToConstructor() {
        System.out.println("in constructor");
    }

    public static void main(String[] args) {
        MyInterface6 myInterface6=Sample::new;
        myInterface6.sample();
    }
}

interface MyInterface6{
//    MethodRefToConstructor sample();
    Sample sample();
}
class Sample{
    public Sample(){
        System.out.println("in sample constructor");
    }
}
