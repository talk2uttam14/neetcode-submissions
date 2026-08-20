class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (String value : tokens) {
            if (value.equals("+") || value.equals("-") || value.equals("*")
                || value.equals("/")) {
                if (value.equals("+")) {
                    result = stack.pop() + stack.pop();
                } else if (value.equals("-")) {
                    int value1 = stack.pop();
                    int value2 = stack.pop();
                    result = value2 - value1;
                } else if (value.equals("*")) {
                    result = stack.pop() * stack.pop();
                } else if (value.equals("/")) {
                    int value1 = stack.pop();
                    int value2 = stack.pop();
                    result = value2 / value1;
                }
                stack.push(result);

            } else {
                stack.push(Integer.parseInt(value));
            }
        }
        return stack.pop();
    }
}
