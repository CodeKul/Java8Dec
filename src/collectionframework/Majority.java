package collectionframework;


import java.util.HashMap;

//find frequency of array element greater than= n/3 times

public class Majority {
    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Integer key : map.keySet()) {
            if ((map.get(key)) >= (n / 3)) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
//        int array[]={1,1,2,3,2,3,1,1,3,2,5,3,3,3,3};
//        majorityElement(array);

        int array1[]={1,2,2,2,3};
        majorityElement(array1);

    }
}
