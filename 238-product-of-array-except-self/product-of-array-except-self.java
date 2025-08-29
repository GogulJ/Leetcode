class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []arr = new int[nums.length];
        int right=1;
        int left=1;

        for(int i=nums.length-1;i>=0;i--){
            arr[i]=right;
            right=right*nums[i]; 
        }

        for(int j=0;j<nums.length;j++){
            arr[j]=arr[j]*left;
            left=left*nums[j];
        }
        return arr;
    }
}