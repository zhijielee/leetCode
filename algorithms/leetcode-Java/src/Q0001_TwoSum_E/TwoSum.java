package Q0001_TwoSum_E;

import java.util.HashMap;

/**
 * @author Die antwort
 * @2020/2/6 18:39
 * Description:
 * Given an array of integers,
 * return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {
    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public int [] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        numMap.put(nums[0], 0);
        for(int i = 1; i < nums.length; i++) {
            if (numMap.containsKey(target - nums[i])) {
                return new int[]{numMap.get(target - nums[i]) , i};
            }

            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
