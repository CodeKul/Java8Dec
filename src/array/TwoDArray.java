package array;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
       int[] array={10,20,30};
       int[][] array1=new int[3][3];

        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements:");
       for(int i=0;i<3;i++)  //enter array
       {
           for(int j=0;j<3;j++)
           {
              array1[i][j]=sc.nextInt();
           }
       }
        System.out.println("array elements are:");

        for(int i=0;i<3;i++)  //display array
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(array1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
