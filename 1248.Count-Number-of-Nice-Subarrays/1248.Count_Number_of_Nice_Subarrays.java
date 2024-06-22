class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1);
        int countOdd = 0;
        int result = 0;
        for(int num : nums) {
            if(num % 2 == 1) {
                countOdd++;
            }
            if(countMap.containsKey(countOdd - k)) {
                result += countMap.get(countOdd - k);
            }
            countMap.put(countOdd, countMap.getOrDefault(countOdd, 0) + 1);
        }
        return result;
    }
}