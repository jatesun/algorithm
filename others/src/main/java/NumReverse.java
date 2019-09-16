/**
 * leetocde编号 num7  整数反转
 * 题目要求：
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 示例 2:
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * 输入: 120
 * 输出: 21
 * -----------------
 * 思考总结：
 * 1、首先的思路是转化为字符串，然后reverse再转为int。这种思路很简单
 * 2、其次想到的思路为
 * -----------------
 * 过程结果：
 * 1：时间，第一种花费不到5分钟思考算法逻辑，2分钟编写，3分钟校验测试反思等等
 * 2：leetcode执行通过。
 * 时间复杂度为O(n)，空间复杂度为O(1)
 * 执行用时 : 23 ms , 在所有 Java 提交中击败了 5.25% 的用户
 * 内存消耗 : 35.4 MB , 在所有 Java 提交中击败了 77.57% 的用户
 * -----------------
 * 更优解
 * 暂无
 * -----------------
 * 反思：干中提到注意溢出，简单try catch。
 *
 * @author sunjiantao
 * @date 2019-09-16
 */
public class NumReverse {
    public static void main(String[] args) {
        NumReverse numReverse = new NumReverse();
        numReverse.reverse(-123);
        numReverse.reverse(123);
        numReverse.reverse(120);
    }

    public int reverse(int x) {
        try {
            String s = String.valueOf(x);
            String results = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                if (i == 0 && x < 0) {
                    results = "-" + results;
                } else {
                    results += s.charAt(i);
                }
            }
            int resulti = Integer.valueOf(results);
            System.out.println(resulti);
            return resulti;
        } catch (Exception e) {
        }
        return 0;
    }
}
