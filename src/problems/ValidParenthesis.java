package problems;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    /*
     *- **Problem**: Given a string containing just the characters `'(', ')', '{', '}', '[' and ']'`, determine if the input string is valid. An input string is valid if:
    1. Open brackets must be closed by the same type of brackets.
    2. Open brackets must be closed in the correct order.
- **Input**: A string containing parentheses.
* {[()]}
* TC: O(n) where n is length of string SC: O(m) where m is number of open brackets char in string
     */

    public static boolean isValid(String s) {

        if(s.isEmpty()) {
            return false;
        }

        HashMap<Character,Character> brackets = new HashMap<>();
        brackets.put('(',')');
        brackets.put('{','}');
        brackets.put('[',']');
        Stack<Character> stringStack = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            if (brackets.containsKey(s.charAt(i)) ) {
                stringStack.push(s.charAt(i));
            }else if (brackets.containsValue(s.charAt(i))) {
                if (stringStack.isEmpty()) {
                    return false;
                }
                char lastPushedChar = stringStack.peek();
                if( s.charAt(i) == brackets.get(lastPushedChar) ) {
                    stringStack.pop();
                }
            } else {
                return false;
            }
        }
        return stringStack.isEmpty();
    }

}
