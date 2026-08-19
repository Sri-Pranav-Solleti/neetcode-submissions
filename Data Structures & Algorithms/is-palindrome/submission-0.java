class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int left = 0;
        int right = n - 1;
        boolean ans = true;
        while (left <= right) {
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if (!Character.isLetterOrDigit(c1)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(c2)) {
                right--;
                continue;
            }
            if (c1 == c2) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return ans;
    }
}
