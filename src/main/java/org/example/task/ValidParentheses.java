package org.example.task;

import java.util.Stack;

public class ValidParentheses {

/*

    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

    Constraints:

    1 <= s.length <= 10^4
    s consists of parentheses only '()[]{}'.

*/

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(')');
            }else if(s.charAt(i)=='['){
                stack.push(']');
            }else if(s.charAt(i)=='{'){
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop()!=s.charAt(i)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

/*

    Стек  — представляет собой список элементов, организованных по принципу LIFO (англ. last in — first out,
     «последним пришёл — первым вышел»).

     1,2,3 - push stack.push(1) stack.push(2) stack.push(3)
     3,2,1 - pop  stack.pop() = 3   stack.pop() = 2  stack.pop() = 1 - вызвав pop элемент из стека удаляется

    Example 1:

    Input: s = "()"
    Output: true
    Example 2:

    Input: s = "()[]{}"
    Output: true
    Example 3:

    Input: s = "(]"
    Output: false

*/

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();

        System.out.println(validParentheses.isValid("()"));
        System.out.println(validParentheses.isValid("()[]{}"));
        System.out.println(validParentheses.isValid("(]"));
    }
}
