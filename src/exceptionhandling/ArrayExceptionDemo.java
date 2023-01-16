package exceptionhandling;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        int[] array=new int[4];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;

        try {
            System.out.println(array[5]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");
        System.out.println("hi");


    }
}
