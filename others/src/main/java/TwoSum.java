import java.util.HashMap;
import java.util.Map;

/**
 * 二数之和
 * 题目要求：
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * -----------------
 * 思考总结：
 * 1、两数之和，很容易想到双层for循环
 * 2、需要注意的一点为双层for循环的i、j不能相同
 * -----------------
 * 过程结果：
 * 1：时间花费了2、3分钟思考算法逻辑，1分钟编写，1分钟校验测试反思等等
 * 2：leetcode执行通过。
 * 时间复杂度为O(n^2)，空间复杂度为O(1)
 * 执行用时 : 52 ms , 在所有 Java 提交中击败了 39.05% 的用户
 * 内存消耗 : 38 MB , 在所有 Java 提交中击败了 77.71% 的用户
 * -----------------
 * 更优解
 * 可以采用hash表的方式，用空间换时间，时间复杂度为O(n)，空间复杂度为O(n)
 * -----------------
 * 反思：题目很简单，注意两数之和不能为同一下标。
 *
 * @author sunjiantao
 * @date 2019-09-05
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum.twoSum(nums, target);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int result = nums[i] + nums[j];
                if (result == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //hash表解法，空间换时间
    public int[] twoSumHash(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complete = target - nums[i];
            if (map.containsKey(complete) && (i != map.get(complete))) {
                return new int[]{i, map.get(complete)};
            }
        }
        return null;
    }
}
