class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] container = new ArrayList[nums.length + 1];
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entries : map.entrySet()){
            int key = entries.getKey();
            int value = entries.getValue();
            if(container[value] == null) {
                container[value] = new ArrayList<>();
            }
            container[value].add(key);
        }
        int [] result = new int[k];
        int index = 0;
        for(int i = container.length - 1; i > 0 && index < k; i --) {
            if(container[i] != null) {
                for(int num : container[i]) {
                   result[index] = num;
                   index += 1;
                }
                if(index == k){
                    break;
                }

            }
        }
    return result;
        
    }
}
