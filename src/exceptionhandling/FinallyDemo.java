package exceptionhandling;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int i=90/2;
            String str=null;
            System.out.println(str.length());

        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }catch (NullPointerException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("hi");
        }



    }
}
