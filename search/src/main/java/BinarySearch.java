/**
 * 二分查找
 * 题目要求：
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * -----------------
 * 思考总结：
 * 1、二分查找，很容易想到应该有左、右两个限定边界，取mid
 * 2、mid小于target，左边界index赋值为mid+1.反之，右边界index赋值为mid-1
 * 3、此时主体逻辑完成，尚缺如何判断执行完成？(没数据可查了？)，
 * 可以想到当left的index与right相同或者更小时，那么说明数据被搜索完毕了，可以停止程序
 * -----------------
 * 过程结果：
 * 1：时间花费了15分钟思考算法逻辑，5分钟编写，5分钟校验测试反思等等
 * 2：leetcode执行通过。
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 78.47% 的用户
 * 内存消耗 : 48.8 MB , 在所有 Java 提交中击败了 55.01% 的用户
 * -----------------
 * 反思：题目不难，更多的时理清左右边界、退出条件。
 *
 * @author sunjiantao
 * @date 2019-09-04
 */
public class BinarySearch {
    public static void main(String[] args) {
        //使用给出的数据测试
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(nums1, 9));
        System.out.println(binarySearch.search(nums1, 2));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }
}
