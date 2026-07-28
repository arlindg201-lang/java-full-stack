package com.code.day18;

import java.util.Stack;

//目标：给定一个包含圆括号 ()、方括号 [] 和花括号 {} 的字符串，编写一个程序判断该字符串中的括号是否正确匹配。
//
//提示：
//
//- 如果遇到(、[、{ 开括号时，压入栈
//- 如果遇到)、]、}闭括号时，弹出栈顶元素，如果不是与之对应的 (、[、{ 开括号，那么匹配不正确。所有字符串处理完，栈中没有残留的开括号，那么匹配正确。
//
//例如：
//
//```java
//{[a * (b + c)] / 2} * (a + b)表达式括号正确
//{[a * ( b + c] / 2)}表达式括号错误
public class homework3 {

    public static void main(String[] args) {
        String test1 = "{[a * (b + c)] / 2} * (a + b)";
        String test2 = "{[a * ( b + c] / 2)}";

        System.out.println(test1 + " 表达式 " + (check(test1) ? "✅ 括号正确" : "❌ 括号错误"));
        System.out.println(test2 + " 表达式 " + (check(test2) ? "✅ 括号正确" : "❌ 括号错误"));
    }

    /**
     * 检查表达式中的括号是否匹配
     * @param str 待检查的表达式
     * @return true-括号匹配正确，false-括号匹配错误
     */
    public static boolean check(String str) {
        if (str == null || str.isEmpty()) {
            return true;  // 空字符串认为括号正确
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // 如果是左括号，入栈
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // 如果是右括号，检查匹配
            else if (ch == ')' || ch == ']' || ch == '}') {
                // 如果栈为空，说明没有对应的左括号
                if (stack.isEmpty()) {
                    return false;
                }

                // 弹出栈顶元素并检查是否匹配
                char left = stack.pop();
                if (!isMatching(left, ch)) {
                    return false;
                }
            }
            // 其他字符（字母、数字、运算符、空格等）忽略
        }

        // 如果栈为空，说明所有括号都匹配；否则还有未匹配的左括号
        return stack.isEmpty();
    }

    /**
     * 判断左右括号是否匹配
     */
    private static boolean isMatching(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '[' && right == ']') ||
                (left == '{' && right == '}');
    }


}
