class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l = temperatures.length;
        int[] result = new int[l];
        Stack<int[]> st = new Stack<>();
        for(int i = 0; i < l; i++) {
            while(!st.isEmpty() && st.peek()[1] < temperatures[i]) {
                int[] pair = st.pop();
                result[pair[0]] = i - pair[0];

            }
            st.push(new int[] {i, temperatures[i]});

        }  
        return result;
    }
}
