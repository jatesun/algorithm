import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * leetocde编号 num13  罗马to整数
 * 题目要求：
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * <p>
 * -----------------
 * 思考总结：
 * 1、题目给出的问题算是简化了，给出了所有的字符也给出了所有可能出现的双字符。
 * 2、想到将所有可能出现字符放到hashmap中。遍历给出的字符，根据情况处理，分为四种情况（题解中已给出）
 * -----------------
 * 过程结果：
 * 1：时间，花费15分钟思考算法逻辑，10分钟编写，1分钟校验测试反思等等
 * 2：leetcode执行通过。
 * 时间复杂度为O(n)，空间复杂度为O(1)
 * 执行用时 : 11 ms , 在所有 Java 提交中击败了 75.94% 的用户
 * 内存消耗 : 37.2 MB , 在所有 Java 提交中击败了 93.21% 的用户
 * -----------------
 * 更优解
 * -----------------
 * 反思：题目比较简单，但是需要注意仔细分析题目中给出的关键点。另外需要注意的为for循环后，如果prev不为空需要加上该值。
 *
 * @author sunjiantao
 * @date 2019-10-08
 */
public class RomaToNum {
    public static Map<String, Integer> numMap = new HashMap<String, Integer>();

    static {
        numMap.put("I", 1);
        numMap.put("V", 5);
        numMap.put("X", 10);
        numMap.put("L", 50);
        numMap.put("C", 100);
        numMap.put("D", 500);
        numMap.put("M", 1000);
        numMap.put("IV", 4);
        numMap.put("IX", 9);
        numMap.put("XL", 40);
        numMap.put("XC", 90);
        numMap.put("CD", 400);
        numMap.put("CM", 900);
    }

    private boolean prevIsEmpty(String prev) {
        return "".equals(prev);
    }

    private boolean curIsIXC(String cur) {
        return "I".equals(cur) || "X".equals(cur) || "C".equals(cur);
    }

    public int romanToInt(String s) {
        /**
         * 逻辑思路
         * 1、从左到右遍历s，如果s遇到I X C开始，继续下一个，如果两个在map里加起来然后sub继续。
         * 2、如果s没遇到I X C，那么正常相加即可。
         */
        int target = 0;
        String prev = "";
        for (int i = 0; i < s.length(); i++) {
            String cur = String.valueOf(s.charAt(i));
            if (curIsIXC(cur) && prevIsEmpty(prev)) {
                //当前为ixc，prev为空（将当前付给prev，continue）
                prev = cur;
                continue;
            } else if (curIsIXC(cur) && !prevIsEmpty(prev)) {
                //当前为ixc，prev不为空。(将这两个查map，有这两个continue。没有的话，之前的prev对照，现在替换prev)
                if (Objects.isNull(numMap.get(prev + cur))) {
                    target += numMap.get(prev);
                    prev = cur;
                    continue;
                } else {
                    target += numMap.get(prev + cur);
                    prev = "";
                    continue;
                }

            } else if (!curIsIXC(cur) && prevIsEmpty(prev)) {
                //当前不为IXC，prev为空。正常处理即可。
                target += numMap.get(cur);

            } else if (!curIsIXC(cur) && !prevIsEmpty(prev)) {
                //当前不为ixc，prev不为空。()
                if (Objects.isNull(numMap.get(prev + cur))) {
                    target += numMap.get(prev);
                    prev = cur;
                    continue;
                } else {
                    target += numMap.get(prev + cur);
                    prev = "";
                    continue;
                }

            }
        }
        if (!"".equals(prev)) {
            target += numMap.get(prev);
        }
        return target;
    }

    public static void main(String[] args) {
        RomaToNum romaToNum = new RomaToNum();
//        System.out.println(romaToNum.romanToInt("III"));
        System.out.println(romaToNum.romanToInt("MCMXCIV"));

    }

}
