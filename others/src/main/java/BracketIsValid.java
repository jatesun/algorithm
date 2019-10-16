import java.util.Stack;

/**
 * 括号的有效性
 *
 * @author sunjiantao
 * @date 2019-10-16
 */
public class BracketIsValid {

    public static void main(String[] args) {
        BracketIsValid bracketIsValid = new BracketIsValid();
        System.out.println(bracketIsValid.isValid("()]"));
        System.out.println(bracketIsValid.isValid("{[]}"));
        System.out.println(bracketIsValid.isValid("([)]"));
    }

    public boolean isValid(String s) {
        /**
         *  使用栈解决
         *  1.左半边入栈，右半部分出栈
         */
        if (s.length() == 0)
            return true;
        if ((s.length() & 1) == 1)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(s.charAt(i));
                    continue;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    continue;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    continue;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    continue;
            }
        }
        return stack.isEmpty();
    }
}
