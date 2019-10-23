/**
 * num27.移除元素
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * @author sunjiantao
 * @date 2019-10-23
 */
public class RemoveElement {

    /**
     * 思路
     * 1、额外空间记录当前需要替换数组的下标值，初始为零
     * 2、遍历数组，如果值等于val，数组的当前下标替换，额外记录的+1。
     */
    public int removeElement(int[] nums, int val) {
        int curIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
            } else {
                nums[curIndex] = nums[i];
                curIndex++;
            }
        }
        return curIndex;
    }
}
