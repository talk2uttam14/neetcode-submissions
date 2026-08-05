class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    if (nums.length < 3) {
        return result;
        }
    Arrays.sort(nums);
    for(int i = 0; i < nums.length - 2; i ++) {
   
    int theSum = nums[i];
    int startIndex = i + 1;
    int endIndex = nums.length - 1;
    if( (i > 0) && (nums[i] == nums[i - 1])) {
        continue;
    }
   
        
    while(startIndex < endIndex) {
        List<Integer> innerValue = new ArrayList<>();
        if ((nums[startIndex] + nums[endIndex] + nums[i]) == 0) {
            innerValue.add(theSum);
            innerValue.add(nums[startIndex]);
            innerValue.add(nums[endIndex]);
        result.add(innerValue);
        endIndex--;
        startIndex++;

     while (startIndex < endIndex && nums[startIndex] == nums[startIndex - 1]) { startIndex++; }
     while (startIndex < endIndex && nums[endIndex] == nums[endIndex + 1]) { endIndex--; }

        continue;
        } else if((nums[startIndex] + nums[endIndex] + nums[i]) > 0) {
            endIndex--;
            continue;
        } else {
            startIndex++;
            continue;
        }
    }

    }
    return result;
    }
}
