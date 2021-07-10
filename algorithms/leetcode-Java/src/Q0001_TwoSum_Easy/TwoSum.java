package Q0001_TwoSum_Easy;

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
    public int [] twoSum(int [] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            // 先判断元素再加入map，防止选择重复元素
            if(hashMap.containsKey(target - nums[i])) {
                return new int[] {hashMap.get(target - nums[i]), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
