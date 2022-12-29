package controlflowstatements;

public class BreakDemo {
    public static void main(String[] args) {
        int array[]={10,20,30,40,50,60,70,80,90,100};

        for(int i=0;i<array.length;i++){
            if(array[i]>50){
                continue;
            }
            System.out.println(array[i]);
        }
    }
}
