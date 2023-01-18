package exceptionhandling;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            int i = 90 / 3;
            System.out.println(i);
           try {
               String str = null;
               System.out.println(str.length());
           }catch (NullPointerException e)
           {
               System.out.println(e);
           }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }


    }
}
