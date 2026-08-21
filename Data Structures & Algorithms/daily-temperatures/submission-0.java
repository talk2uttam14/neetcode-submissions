class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                stack.push(new int[]{temperatures[0],0});
                continue;
            }
            while(!stack.isEmpty() && stack.peek()[0] < temperatures[i]) {
                int[] pair = stack.pop();
                result[pair[1]] = i - pair[1];
            }
            stack.push(new int[] {temperatures[i], i});
            
        }
        return result;
    }
}
