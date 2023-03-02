package java8;
public class MethodReference {
    public static void main(String[] args) {
        MethodReference obj=new MethodReference();
        obj.display();
        MyInterface4 myInterface4=obj::display;
        myInterface4.show();
    }
    public void display(){
        System.out.println("in display method");
    }
}
interface MyInterface4 {
    void show();
}

