
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack[++top] = c;
            } else {
                if (top == -1) {
                    return false;
                }

                char openingBracket = stack[top];
                if (openingBracket == '(' && c == ')' || openingBracket == '[' && c == ']'
                        || openingBracket == '{' && c == '}') {
                    top--;
                } else {
                    return false;
                }
            }
        }
        return top == -1;
    }
}
