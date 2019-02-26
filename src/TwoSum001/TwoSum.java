package TwoSum001;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashTable = new HashMap<Integer, Integer>();
        int i = 0;
        while ((i < nums.length) && (hashTable.get(nums[i]) == null)) {
            hashTable.put(target - nums[i], i);
            i++;
        }
        if (i < nums.length) {
            return new int[]{hashTable.get(nums[i]),i};
        }
        return null;
    }

    public static void test(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums,target);
        for (int i : result)
        System.out.println(i);
    }
}
