class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        
        String buffer = new StringBuffer(str);
        buffer.reverse();

        return str.equals(buffer);
    }
}