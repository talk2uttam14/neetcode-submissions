class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String st: strs) {
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String sortedSt = new String(ch);
            if (!map.containsKey(sortedSt)) {
                map.put(sortedSt,new ArrayList<>());
            }
            map.get(sortedSt).add(st);

        }
        return new ArrayList<>(map.values());
    }
}
