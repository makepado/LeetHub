import java.util.*;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();

        //matching with Integer and String
        for(int i=0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }

        //sorting integer array
        Integer[] integerArray = Arrays.stream(heights).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArray, Collections.reverseOrder());

        //result array
        String[] result = new String[heights.length];

        //iterate for stack the result string array
        for(int i=0; i < integerArray.length; i++) {
            String currentString = map.get(integerArray[i]);
            result[i] = currentString;
        }

        return result;
    }
}