class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        char[] characters = s.toCharArray();
        if(characters.length < 2) {
                return false;
        }
        for(char c: characters) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            if(c == ')' || c == '}' || c == ']') {
                if(stack.peek() == map.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } 
        }
        return stack.isEmpty();

        
    }
}
