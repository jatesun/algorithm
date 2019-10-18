/**
 * 删除排序数组的重复项
 *
 * @author sunjiantao
 * @date 2019-10-18
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
//        int[] target = {1, 1, 2};
        int[] target1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.removeDuplicates(target1);
        System.out.println("长度：" + length);
        for (int i = 0; i < length; i++) {
            System.out.println(target1[i]);
        }
    }

    public int removeDuplicates(int[] nums) {
        int curLength = 0;
        int prev = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prev = nums[i];
                nums[curLength] = prev;
                curLength++;
            } else if (prev == nums[i]) {
                continue;
            } else {
                prev = nums[i];
                nums[curLength] = prev;
//                nums[i]++;
                curLength++;
            }
        }
        return curLength;
    }
}
