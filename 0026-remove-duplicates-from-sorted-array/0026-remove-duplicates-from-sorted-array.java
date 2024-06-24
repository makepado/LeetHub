class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> integerHashSet = new HashSet<>();
        
        // 배열 -> Set
        for (int i : nums) {
            integerHashSet.add(i);
        }

        // Set -> 배열
        Integer[] arr = integerHashSet.toArray(new Integer[0]);
        Arrays.sort(arr);
        
        for(int i=0; i < arr.length; i++) {
            nums[i] = arr[i];

            System.out.println(arr[i]);
        }

        return arr.length;
    }
}