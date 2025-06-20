package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/*
 * Author: BUI QUOC VAN
 * Ex: TwoSum
 * Date: 3/6/2025
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
 