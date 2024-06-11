class Solution {
    public int[] twoSum(int[] nums, int target) {
        //MAP을 이용해 key:현재값, value:index 로 구분
        HashMap<Integer, Integer> map = new HashMap<>();

        //순회
        for(int i=0; i < nums.length; i++) {
            int currentValue = target - nums[i];
            //1. target - 현재값이 map에 있으면
            if(map.containsKey(currentValue)) {
                int completeValue = map.get(currentValue);
                //현재 index와 target-현재값의 index 리턴
                return new int[] { i, completeValue };
            }

            //2. target - 현재값이 map에 없으면 추가
            map.put(nums[i], i);
        }
        //이외에 빈값을 리턴
        throw new IllegalArgumentException("No two sum solution");
    }
}