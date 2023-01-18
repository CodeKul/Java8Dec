package exceptionhandling;

public class ExceptionPropogation {
    public void a(){
        int i=23/0;
    }

    public void b()
    {
        a();
    }
    public void c()
    {
        try {
            b();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        ExceptionPropogation obj=new ExceptionPropogation();
        obj.c();
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
    }
}
