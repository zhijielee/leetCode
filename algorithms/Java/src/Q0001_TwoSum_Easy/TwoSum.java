package Q0001_TwoSum_Easy;

import java.util.HashMap;

/**
 * @author Die antwort
 * @2020/2/6 18:39
 * Description:
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
