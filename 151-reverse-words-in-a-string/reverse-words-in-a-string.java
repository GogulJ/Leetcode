class Solution {
    public String reverseWords(String s) {
        
        String[] str = s.split(" ");
        int length = str.length;

        for(int i=0; i<length/2; i++){
            String temp = str[i];
            str[i] = str[length-1-i];
            str[length-1-i] = temp;
        }

        return(String.join(" ",str)).trim().replaceAll("\\s+"," ");
    }
}