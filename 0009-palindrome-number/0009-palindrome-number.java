class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String reverse = "";

        for(int i=str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return str.equals(reverse);
    }
}