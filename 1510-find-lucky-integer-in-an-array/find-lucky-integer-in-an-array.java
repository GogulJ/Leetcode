class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        
        for(int i=arr.length-1; i>=0;){
            int num = arr[i];
            int count =0;
            while(i>=0 && arr[i]==num){
                count++;
                i--;
            }if(count==num){
                return num;
            }
            
        }
        return -1;
    }
}