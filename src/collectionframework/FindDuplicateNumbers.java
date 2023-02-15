package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6,1,2,2,3,9};
       Set<Integer> set=new HashSet<>();

       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   set.add(arr[i]);
               }
           }
       }
        System.out.println(set);
    }
}
