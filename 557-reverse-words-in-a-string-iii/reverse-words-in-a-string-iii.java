class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String word:words){
            StringBuilder m = new StringBuilder(word);
            sb.append(m.reverse().toString()).append(" ");
        }
        return sb.toString().trim();
    }
}