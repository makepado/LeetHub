class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }

        return str.equals(reverseStr);
    }
}