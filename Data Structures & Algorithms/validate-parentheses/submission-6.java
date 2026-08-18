class Solution {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();

        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');
        for (char ch : charArray) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if ((ch == ')' || ch == '}' || ch == ']')) {
                if (stack.isEmpty()) {
                    return false;
                }
                if(map.get(ch) != stack.peek()) {
                   return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
