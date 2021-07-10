/**
 * @Author: Die antwort
 * @Date: 2021/7/10 下午4:09
 * @Description:
 */
import Q0001_TwoSum_Easy.TwoSum;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {1, 2, 3, 5, 7};
        int[] result = twoSum.twoSum(nums, 9);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
