class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;;
        int count = 0;
        // for(int i=0; i<people.length; i++) {
            int a = 0;
            while(left <= right) {
                if(people[left] + people[right] <= limit) {
                    left++;
                    right--;
                }
                else {
                    right--;
                }
                count++;
            }
        // }
        return count;
    }
}