class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length < 2){
            return result;
        }
        for(int i = 0; i < nums.length - 2; i ++) {
            while(i > 0 && i < nums.length - 1 && nums[i] == nums[i-1]) {
                i++;
            }

            for(int j = i +1 ; j < nums.length - 1; j ++) {
                for(int k = nums.length -1; k > j; k--) {
                    while(j < k) {
                        int sum = nums[i]+ nums[j]+ nums[k];
                        List<Integer> list = new ArrayList<>();
                        if (sum > 0) {
                            k--;
                        } else if (sum < 0) {
                            j++;
                        } else {
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            result.add(list);
                            j++;
                            k--;
                            while(j < k && nums[j] == nums[j-1]) {
                                j++;
                            }
                            while(k > j  && k < nums.length -1 && nums[k] == nums[k+1]) {
                                k++;
                            }
                        }

                    }

                }
            }

        }
        return result;
    }
}
