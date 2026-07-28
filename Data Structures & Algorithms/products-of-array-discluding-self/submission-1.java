class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] suffixProduct = new int[n];
        int rightProduct = 1;
        int leftProduct = 1;
        for(int i = n - 1; i >= 0; i--){
            suffixProduct[i] = rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        for(int i = 0; i < n; i++) {
            suffixProduct[i] = suffixProduct[i] * leftProduct;
            leftProduct = leftProduct * nums[i];
        }
        return suffixProduct;
    }
}  
