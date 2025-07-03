class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []arr = new int [nums.length];

        int positive = 1;
        int negative = 0;

        for(int i : nums){

            if(i<0){
                arr[positive] = i;
                positive +=2;
            }else{
                arr[negative] = i;
                negative +=2;
            }
        }
        return arr;
    }
}