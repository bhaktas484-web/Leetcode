
class Solution {
    public int scoreOfParentheses(String s) {

        int[] stack = new int[s.length()];
        int top = 0;

        stack[0] = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                top++;
                stack[top] = 0;
            } 
            else {
                int inside = stack[top];
                top--;

                if (inside == 0) {
                    stack[top] += 1;
                } 
                else {
                    stack[top] += 2 * inside;
                }
            }
        }

        return stack[0];
    }
}