class Solution {
    public int[] replaceElements(int[] arr) {
        
        for(int i=0; i<arr.length; i++){
            int index = 0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>index){
                    index = arr[j];
                }                
            }
            arr[i] = index;
        }
        arr[arr.length-1] = -1;
        return arr;

    }
}