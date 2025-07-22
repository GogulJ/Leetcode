class Solution {
    public boolean isPerfectSquare(int num) {
        int n = (int)Math.sqrt(num);
        if(n==Math.sqrt(num)){
            return true;
        }else{
            return false;
        }
    }
}