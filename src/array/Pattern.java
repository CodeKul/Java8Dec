package array;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        int  row = 6;
        for (int i=0; i<row; i++)
        {
            for (int j=row-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }




        int space = row - 1;
        for (int j = 1; j<= row; j++)
        {
            for (int i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (int i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (int j = 1; j<= row - 1; j++)
        {
            for (int i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (int i = 1; i<= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


        System.out.println("Enter n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int value=1;
        int minCol = 0;
        int maxCol = n-1;
        int minRow = 0;
        int maxRow=n-1;


        while (value <= n*n)
        {
            for (int i = minCol; i <= maxCol; i++)
            {
                arr[minRow][i] = value;
                value++;
            }

            for (int i = minRow+1; i <= maxRow; i++)
            {
                arr[i][maxCol] = value;
                value++;
            }

            for (int i = maxCol-1; i >= minCol; i--)
            {
                arr[maxRow][i] = value;
                value++;
            }

            for (int i = maxRow-1; i >= minRow+1; i--)
            {
                arr[i][minCol] = value;
                value++;
            }
//            minCol++;
//            minRow++;
//            maxCol--;
//            maxRow--;
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }

    }
}
