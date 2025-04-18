class Solution {
    public int missingNumber(int[] nums) {
        
        int index = 0;

        for(int i=0;i<nums.length;i++){
            index+=nums[i];
        }
        return (nums.length*(nums.length+1)/2)-index;
        
    }
}