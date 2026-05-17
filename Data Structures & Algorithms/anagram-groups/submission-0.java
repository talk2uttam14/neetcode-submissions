class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String newStr = new String(charArray);

            map.putIfAbsent(newStr, new ArrayList<>());

            map.get(newStr).add(str);

        }
        return new ArrayList(map.values());

        
    }
}
