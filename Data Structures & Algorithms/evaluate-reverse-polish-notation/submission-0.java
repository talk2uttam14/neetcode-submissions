class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (String value : tokens) {
            if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
                int val1 = stack.pop();
                int val2 = stack.pop();
                if (value.equals("+")) {
                    result = val2 + val1;
                } else if (value.equals("-")) {
                    result = val2 - val1;
                } else if (value.equals("*")) {
                    result = val2 * val1;
                } else if (value.equals("/")) {
                    result = val2 / val1;
                }
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(value));
            }
        }
        return stack.pop();
    }
}
