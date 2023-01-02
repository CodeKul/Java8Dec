package controlflowstatements;

public class StarPattern {
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
        {
            for (int j=0;j<4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }



        for(int i=0;i<4;i++)
        {
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        int count=1;
        for(int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
}
