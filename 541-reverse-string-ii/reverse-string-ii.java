class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i += 2 * k) {
            int end = Math.min(i + k, n);
            StringBuilder temp = new StringBuilder(s.substring(i, end));
            result.append(temp.reverse());

            if (i + k < n) {
                int nextEnd = Math.min(i + 2 * k, n);
                result.append(s.substring(i + k, nextEnd));
            }
        }

        return result.toString();
    }
}
