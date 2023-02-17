package collectionframework;


import java.util.HashMap;

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
            if ((map.get(key)) > (n / 3)) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int array[]={1,1,2,3,2,2,1,1,1};
        majorityElement(array);

//        int array1[]={1,2};
//        majorityElement(array1);

    }
}
