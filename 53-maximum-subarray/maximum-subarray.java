class Solution {
    public int maxSubArray(int[] nums) {
        int i=0;
        int currentsum=0;
        int maxsum=nums[0];

        for(int j=0;j<nums.length;j++){
            currentsum+=nums[j];
            maxsum=Math.max(maxsum,currentsum);

            if(currentsum<0){
                currentsum=0;
                i=j+1;
            }
        }
        return maxsum;
    }
}