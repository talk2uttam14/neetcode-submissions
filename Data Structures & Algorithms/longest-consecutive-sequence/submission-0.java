class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest = 0;

        for(int num: set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int currentStreak = 1;
                while(set.contains(current+1)) {
                    current += 1;
                    currentStreak += 1;

                }
                longest = Math.max(currentStreak, longest);

            }


        }
        return longest;
        
    }
}
