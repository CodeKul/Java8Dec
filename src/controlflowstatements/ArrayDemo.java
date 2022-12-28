package controlflowstatements;

public class ArrayDemo {
    public static void main(String[] args) {
//        int array[]={10,20,30,40,50,60};
        int array[]=new int[10];

        System.out.println(array.length);
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;

        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
