class Solution {
    public int[] twoSum(int[] nums, int target) {
        //MAP을 이용해 key:현재값, value:index 로 구분
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        //순회
        for(int i=0; i < nums.length; i++) {
            
            //1. target - 현재값이 map에 있으면
            if(map.containsKey(target - nums[i])) {

                //현재 index와 target-현재값의 index 리턴
                result[0] = i;
                result[1] = map.get(target - nums[i]);
                return result;
            }

            //2. target - 현재값이 map에 없으면 추가
            map.put(nums[i], i);
        }
        //이외에 빈값을 리턴
        return result;
    }
}