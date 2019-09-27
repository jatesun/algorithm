/**
 * leetocde编号 num9 回文数
 * 题目要求：
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * -----------------
 * 思考总结：
 * 1、最简单方法将int转为string，从后往前将string放到新的string中
 * 2、判断两个string是否相同
 * -----------------
 * 过程结果：
 * 1：时间花费了2、3分钟思考算法逻辑，1分钟编写，1分钟校验测试反思等等
 * 2：leetcode执行通过。
 * 时间复杂度为O(n)
 * 执行用时 : 12 ms , 在所有 Java 提交中击败了 92.34% 的用户
 * 内存消耗 : 36.8 MB , 在所有 Java 提交中击败了 91.57% 的用户
 * -----------------
 * 更优解
 * 不用字符串解决
 * -----------------
 * 反思：转字符串很容易想到。
 *
 * @author sunjiantao
 * @date 2019-09-27
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(121));
        System.out.println(p.isPalindrome(-121));
        System.out.println(p.isPalindrome(10));

    }

    public boolean isPalindrome(int x) {
        String source = String.valueOf(x);
        StringBuilder target = new StringBuilder();
        for (int i = source.length() - 1; i >= 0; i--) {
            target.append(source.charAt(i));
        }
        return source.equals(target.toString());
    }
}



























