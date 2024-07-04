class Solution {
    public int searchInsert(int[] nums, int target) {
        int cnt = 0;
        while  (cnt < nums.length) {
            if (nums[cnt] >= target){
                return cnt;
            }
            cnt++;
        }
        return nums.length;
    }
}