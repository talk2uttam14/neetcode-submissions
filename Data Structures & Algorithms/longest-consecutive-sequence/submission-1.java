class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0){
            return 0;
            }
        int maxLength = 1;
        Set<Integer> containerSet = new HashSet<>();
        for( int i = 0 ; i < nums.length; i ++) {
            containerSet.add(nums[i]);
        }
        for(int i = 0 ; i < nums.length; i ++) {
           int currentNum = nums[i];
            int currLength = 1;
            if(containerSet.contains(currentNum - 1)) {
                continue;
            } else {
                while(containerSet.contains(currentNum + 1)) {
                    currentNum++;
                    currLength++;
                }
            }
            maxLength = Math.max(maxLength, currLength);
        }
        return maxLength;
    }
}
