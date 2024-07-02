class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //Add +1 to the key for each duplicate number
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < nums1.length; i++) {
            int currentVal = nums1[i];
            int storedValOrDefault = map.getOrDefault(currentVal, 0) + 1;
            map.put(currentVal, storedValOrDefault);
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0; i < nums2.length; i++) {
            //if value is in map && that value upper than 0
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                int substractCount = map.get(nums2[i]) -1;
                map.put(nums2[i], substractCount);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}