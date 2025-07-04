class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        if(n<=0){
            return 0;
        }

        int longest = 1;
        int curr_leng = 1;
        int count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }else if(nums[i]==nums[i-1]+1){
                curr_leng++;     
            }else{
                if(curr_leng>longest){
                    longest = curr_leng;
                }
                curr_leng =1;
            }
        }
        if(curr_leng > longest) {
            longest = curr_leng;
        }
        return longest;
    }
}