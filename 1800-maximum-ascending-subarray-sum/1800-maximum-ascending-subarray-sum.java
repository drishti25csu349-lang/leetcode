class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum  = nums[0];
        int ans = nums[0];
        for(int i  = 1 ;i<nums.length;i++){
            sum =  sum + nums[i];
            if(nums[i]>nums[i-1]){
                if(sum > ans ){
                    ans = sum ;
                }
            }
            else{
              sum = nums[i];
            }
        }
        return ans ;
    }
}