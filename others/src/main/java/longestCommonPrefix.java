/**
 * @author sunjiantao
 * @date 2019-10-11
 */
public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] ss = {"flower", "flow", "flight"};
        longestCommonPrefix longestCommonPrefix = new longestCommonPrefix();
        String s = longestCommonPrefix.longestCommonPrefix(ss);
        System.out.println("结果为：" + s);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder result = new StringBuilder();
        if (strs.length > 1) {
            int len = strs[0].length();
            for (int i = 0; i < len; i++) {
                char curr = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].length() <= i || strs[j].charAt(i) != curr) {
                        return result.toString();
                    }
                    if (strs[j].charAt(i) == curr && j == strs.length - 1) {
                        result.append(curr);
                    }
                }
            }
        }
        return result.toString();
    }

}
