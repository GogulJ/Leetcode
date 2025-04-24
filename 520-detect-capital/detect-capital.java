class Solution {
    public boolean detectCapitalUse(String word) {
        
        String Upper = word.toUpperCase();
        String Lower = word.toLowerCase();

        if(word == Upper){
            return true;
        }else if(word == Lower){
            return true;
        }else if(Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            
            return true;
        }
        return false;
    }
}