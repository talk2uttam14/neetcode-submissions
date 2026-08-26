class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int result = 0;
        for (String item : tokens) {
            if (item.equals("+")  || item.equals("-") || item.equals("*") || item.equals("/")) {
                if (item.equals("+")) {
                    int val1 = st.pop();
                    int val2 = st.pop();
                    result = val2 + val1;
                } else if (item.equals("-")) {
                    int val1 = st.pop();
                    int val2 = st.pop();
                    result = val2 - val1;
                } else if (item.equals("*")) {
                    int val1 = st.pop();
                    int val2 = st.pop();
                    result = val2 * val1;
                } else {
                    int val1 = st.pop();
                    int val2 = st.pop();
                    result = val2 / val1;
                }
                st.push(result);
            } else {
                st.push(Integer.parseInt(item));
            }
        }
        return st.pop();
    }
}
