class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        //순회
        for(int i=0; i < nums.length; i++) {
            
            //2. target - 현재값이 map에 있으면
            if(map.containsKey(target - nums[i])) {
                //현재 index와 target-현재값의 index 리턴
                return new int[] {i, map.get(target - nums[i])};
            }
            //1. target - 현재값이 map에 없으면 key:현재값, value:index 추가
            map.put(nums[i], i);
        }

        return new int[] {};
    }
}