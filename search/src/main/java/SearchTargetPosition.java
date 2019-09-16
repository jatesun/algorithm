/**
 * leetocde编号 num35  搜索插入位置
 * 题目要求：
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * -----------------
 * 思考总结：
 * 1、根据题干很容易想出思路，for循环即可
 * 2、需要注意的一点为如果target比数据所有数都大，需要for循环结束后返回length即为插入位置。
 * -----------------
 * 过程结果：
 * 1：时间，花费不到1分钟思考算法逻辑，2分钟编写，1分钟校验测试反思等等
 * 2：leetcode执行通过。
 * 时间复杂度为O(n)，空间复杂度为O(1)
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 80.11% 的用户
 * 内存消耗 : 39.4 MB , 在所有 Java 提交中击败了 42.78% 的用户
 * -----------------
 * 更优解
 * -----------------
 * 反思：题目很简单，注意target比所有数都大的边界即可。
 *
 * @author sunjiantao
 * @date 2019-09-07
 */
public class SearchTargetPosition {
    public static void main(String[] args) {
        SearchTargetPosition st = new SearchTargetPosition();
        int[] arrays = {1, 3, 5, 6};
        System.out.println(st.searchInsert(arrays, 5));
        System.out.println(st.searchInsert(arrays, 2));
        System.out.println(st.searchInsert(arrays, 7));
        System.out.println(st.searchInsert(arrays, 0));
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                continue;
            } else if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
